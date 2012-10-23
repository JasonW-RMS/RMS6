package com.rms

import grails.test.GrailsUnitTestCase

class ContactIntegrationTests extends GrailsUnitTestCase {
    void testCreateContact() {

        int totalContacts = Contact.count()
        int totalAddresses = Address.count()

        def newContact = new Contact(fullName: 'testFirstSaveEver')
        if(newContact.save()) { println "ContactIntegrationTests: New contact saved"}
        else { newContact.errors.allErrors.each { println it.defaultMessage} }
        newContact.addToAddresses(addressLine1: 'address1').save()
        println "ContactIntegrationTests: New address added for new contact"

        assertEquals totalContacts+1, Contact.count()
        assertEquals totalAddresses+1, Address.count()
        //assertNotNull firstContact.save()
        //assertNotNull firstContact.id

        //def foundContact = Contact.get(firstContact.id)
        //assertEquals 'testFirstSaveEver', foundContact.fullName
    }
}
