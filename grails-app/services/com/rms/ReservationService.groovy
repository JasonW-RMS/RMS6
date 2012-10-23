package com.rms

class ReservationService {

    def updateReservation(Reservation reservationInstance, def params) {
        def result = [:]

        try {
            if (!reservationInstance) {
                result = [error: 'not.found']
            }
            else {
                reservationInstance.properties = params

                if (reservationInstance.hasErrors() || !reservationInstance.save(flush: true)) {
                    result = [error: 'has.errors']
                }
            }
        }
        catch (Exception ex) {
            result = [error: 'has.errors']
        }
        result
    }

    def deleteReservation(Reservation reservationInstance) {
        def result = [:]

        try {
            if (!reservationInstance) {
                result = [error: 'not.found']
            }
            else {
                reservationInstance.delete(flush: true)
            }
        }
        catch (Exception ex) {
            result = [error: 'has.errors']
        }
        result
    }
}
