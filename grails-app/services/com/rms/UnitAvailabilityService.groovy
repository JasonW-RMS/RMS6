package com.rms

import org.joda.time.DateTime
import org.joda.time.Interval

class UnitAvailabilityService {

    boolean transactional = false

    public List<Unit> getAvailableUnitsForAGivenDateRange(DateTime arrival, DateTime departure) {
        // :TODO: At some point, need to get units for the incoming customer not all units in system
        def allUnits = Unit.findAll()
        allUnits.findAll { unit ->
            def add
            def reservations = Reservation.findAllByUnit(unit)
            if (!reservations) {
                add = true
            } else {
                add = (!reservations.any { reservation ->
                    Interval interval = new Interval(new DateTime(reservation.arrivalDate), new DateTime(reservation.departureDate))
                    (interval.contains(arrival) || interval.contains(departure))
                })
            }
            add
        }
    }
}
