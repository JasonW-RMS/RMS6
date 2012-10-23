package com.rms

class Vendor {

    String vendorCode

    static hasMany = [contacts: Contact, unitCharacteristics: UnitCharacteristic]

    static constraints = {
    }
}
