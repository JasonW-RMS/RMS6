package com.rms

class Contact {

    static hasMany = [addresses: Address, emails: Email, phones: Phone, inquiryTransactions: InquiryTransaction]

    String fullName
    String firstName
    String lastName
    Boolean allowExport = true
    ContactType contactType = ContactType.GUEST

    static mapping = {
        addresses(cascade: 'all-delete-orphan')
        emails(cascade: 'all-delete-orphan')
        phones(cascade: 'all-delete-orphan')
    }

    String toString() { fullName }

    static constraints = {
        fullName(blank: false)
        firstName(nullable: true)
        lastName(nullable: true)
        inquiryTransactions(nullable: true)
    }
}
