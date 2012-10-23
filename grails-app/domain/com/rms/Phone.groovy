package com.rms

class Phone {

    String phoneNumber
    PhoneType phoneType
    Boolean primaryPhone = false

    String toString() {
        "phoneNumber ${phoneType.toString()}"
    }

    static constraints = {
        phoneNumber(blank: false)
        phoneType(nullable: true)
    }
}
