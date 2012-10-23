package com.rms

class Owner {

    static hasMany = [units: Unit]

    Contact contact
    String code
    TaxNumber taxNumber

    String toString() { code }

    static constraints = {
        contact(nullable: false)
        code(nullable: false)
        taxNumber(nullable: true)
    }
}
