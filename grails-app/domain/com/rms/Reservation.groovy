package com.rms

import org.joda.time.DateTime
import org.joda.time.Days

class Reservation {

    Contact contact
    Unit unit
    Bank bank
    AdvertisingCode advertisingCode

    Date arrivalDate = new Date()
    Date departureDate = new Date() + 1
    Boolean earlyArrival = false
    Boolean lateDeparture = false
    Boolean allDay = true

    static transients = ['duration']

    public int getDuration() { (arrivalDate..departureDate).size() }

    String toString() {
        "Reservation ID: ${id} (${arrivalDate.format('MM/dd')} - ${departureDate.format('MM/dd')})"
    }

    static constraints = {
        contact(nullable: false)
        unit(nullable: false)
        bank(nullable: true)
        advertisingCode(nullable: true)
        arrivalDate(required: true, nullable: false)
        departureDate(required: true, nullable: false, validator: {Date departure, Reservation incoming ->
            Days.daysBetween(new DateTime(incoming.arrivalDate), new DateTime(departure)).days >= 1
        })
    }

}
