package com.rms

class Address {

    String addressLine1
    String addressLine2
    String city
    String state
    String zip
    //StateType state //TODO StateType enum?
    String country
    String nonUsAddress
    String region
    AddressType addressType = AddressType.BILLING //TODO remove default value

    String toString() { addressLine1 }

    static constraints = {
        addressLine1(blank: false)
        addressLine2(nullable: true)
        city(nullable: true)
        state(nullable: true)
        zip(nullable: true)
        country(nullable: true)
        nonUsAddress(nullable: true)
        region(nullable: true)
    }
}
