package com.rms

class InquiryTransaction {

    Contact contact
    Date arrivalDateRequested
    Date departureDateRequested
    ContactMethod contactMethod
    Date inquiryDate
    InquiryGrade inquiryGrade
    String searchCriteria
    AdvertisingCode advertisingCode

    static constraints = {
    }
}
