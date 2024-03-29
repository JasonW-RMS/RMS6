package com.rms

import org.springframework.dao.DataIntegrityViolationException

class UnitController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [unitInstanceList: Unit.list(params), unitInstanceTotal: Unit.count()]
    }

    def create() {
        [unitInstance: new Unit(params)]
    }

    def save() {
        def unitInstance = new Unit(params)
        if (!unitInstance.save(flush: true)) {
            render(view: "create", model: [unitInstance: unitInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'unit.label', default: 'Unit'), unitInstance.id])
        redirect(action: "show", id: unitInstance.id)
    }

    def show(Long id) {
        def unitInstance = Unit.get(id)
        if (!unitInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'unit.label', default: 'Unit'), id])
            redirect(action: "list")
            return
        }

        [unitInstance: unitInstance]
    }

    def edit(Long id) {
        def unitInstance = Unit.get(id)
        if (!unitInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'unit.label', default: 'Unit'), id])
            redirect(action: "list")
            return
        }

        [unitInstance: unitInstance]
    }

    def update(Long id, Long version) {
        def unitInstance = Unit.get(id)
        if (!unitInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'unit.label', default: 'Unit'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (unitInstance.version > version) {
                unitInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'unit.label', default: 'Unit')] as Object[],
                        "Another user has updated this Unit while you were editing")
                render(view: "edit", model: [unitInstance: unitInstance])
                return
            }
        }

        unitInstance.properties = params

        if (!unitInstance.save(flush: true)) {
            render(view: "edit", model: [unitInstance: unitInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'unit.label', default: 'Unit'), unitInstance.id])
        redirect(action: "show", id: unitInstance.id)
    }

    def delete(Long id) {
        def unitInstance = Unit.get(id)
        if (!unitInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'unit.label', default: 'Unit'), id])
            redirect(action: "list")
            return
        }

        try {
            unitInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'unit.label', default: 'Unit'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'unit.label', default: 'Unit'), id])
            redirect(action: "show", id: id)
        }
    }
}
