package com.rms

class Unit {

    static hasMany = [phones: Phone, unitCharacteristics: UnitCharacteristic, reservations: Reservation]
    String code
    String name
    Address address
    Owner owner

    RentalStatus rentalStatus
    DepositSchedule depositSchedule
    UnitMap unitMap

    String toString() { code }

    static constraints = {
        code(blank: false, unique: true)
        name(nullable: true)
        address(nullable: false)
        owner(nullable: false)
        rentalStatus(nullable: true)
        depositSchedule(nullable: true)
        unitMap(nullable: true)
    }
}
