import grails.util.Environment
import com.rms.*
import org.joda.time.DateTime

class BootStrap {

    def init = { servletContext ->
        switch (Environment.current) {
            case Environment.DEVELOPMENT:
                if (Contact.count() == 0 && Address.count() == 0) {
                    createSomeContactsAndAddresses()
                }
                if (Owner.count() == 0) {
                    createSomeOwners()
                }
                if (Unit.count() == 0 && Reservation.count() == 0) {
                    createSomeUnitsAndReservations()
                }
            break
        }
    }
    def destroy = {
    }

    def createSomeContactsAndAddresses() {
        def address1 = new Address(addressLine1: "TestAddress1 addedFrom TestContact1").save(flush: true)
        def address2 = new Address(addressLine1: "TestAddress2 addedFrom TestContact1").save(flush: true)
        def address3 = new Address(addressLine1: "TestAddress1 addedFrom TestContact2").save(flush: true)
        def address4 = new Address(addressLine1: "TestAddress1 addedFrom TestContact3").save(flush: true)

        new Contact(fullName: "TestContact1", addresses: [address1, address2]).save(flush: true)
        new Contact(fullName: "TestContact2", addresses: address3).save(flush: true)
        new Contact(fullName: "TestContact3", addresses: address4).save(flush: true)
        new Contact(fullName: "TestContact4").save(flush: true)
        new Contact(fullName: "TestContact5").save(flush: true)
        new Contact(fullName: "TestContact6").save(flush: true)
        new Contact(fullName: "TestContact7").save(flush: true)
        new Contact(fullName: "TestContact8").save(flush: true)
        new Contact(fullName: "TestContact9").save(flush: true)
        new Contact(fullName: "TestContact10").save(flush: true)
    }

    def createSomeOwners() {
        new Owner(code: "TestOwnerCode1", contact: Contact.findAll()[0]).save(flush: true)
        new Owner(code: "TestOwnerCode2", contact: Contact.findAll()[1]).save(flush: true)
        new Owner(code: "TestOwnerCode3", contact: Contact.findAll()[7]).save(flush: true)
        new Owner(code: "TestOwnerCode4", contact: Contact.findAll()[9]).save(flush: true)
    }

    def createSomeUnitsAndReservations() {
        Address address3 = new Address(addressLine1: "TestAddress3 addedFrom TestUnit1").save(flush: true)
        Address address4 = new Address(addressLine1: "TestAddress4 addedFrom TestUnit2").save(flush: true)
        Address address5 = new Address(addressLine1: "TestAddress5 addedFrom TestUnit3").save(flush: true)
        Address address6 = new Address(addressLine1: "TestAddress6 addedFrom TestUnit4").save(flush: true)

        Unit u1 = new Unit(code: "TestCode1", name: "TestUnit1", address: address3, owner: Owner.findAll()[0]).save(flush: true)
        Unit u2 = new Unit(code: "TestCode2", name: "TestUnit2", address: address4, owner: Owner.findAll()[0]).save(flush: true)
        Unit u3 = new Unit(code: "TestCode3", name: "TestUnit3", address: address5, owner: Owner.findAll()[0]).save(flush: true)
        Unit u4 = new Unit(code: "TestCode4", name: "TestUnit4", address: address6, owner: Owner.findAll()[1]).save(flush: true)

        new Reservation(unit: u1, contact: Contact.findAll()[2], arrivalDate: new DateTime().plusDays(1).toDate(), departureDate: new DateTime().plusDays(3).toDate()).save(flush: true)
        new Reservation(unit: u1, contact: Contact.findAll()[3], arrivalDate: new DateTime().plusDays(4).toDate(), departureDate: new DateTime().plusDays(7).toDate()).save(flush: true)
        new Reservation(unit: u2, contact: Contact.findAll()[4], arrivalDate: new DateTime().plusDays(1).toDate(), departureDate: new DateTime().plusDays(2).toDate()).save(flush: true)
        new Reservation(unit: u2, contact: Contact.findAll()[2], arrivalDate: new DateTime().plusDays(5).toDate(), departureDate: new DateTime().plusDays(10).toDate()).save(flush: true)
        new Reservation(unit: u3, contact: Contact.findAll()[4], arrivalDate: new DateTime().plusDays(4).toDate(), departureDate: new DateTime().plusDays(25).toDate()).save(flush: true)
        new Reservation(unit: u4, contact: Contact.findAll()[5], arrivalDate: new DateTime().plusDays(2).toDate(), departureDate: new DateTime().plusDays(10).toDate()).save(flush: true)
        new Reservation(unit: u4, contact: Contact.findAll()[6], arrivalDate: new DateTime().plusDays(21).toDate(), departureDate: new DateTime().plusDays(30).toDate()).save(flush: true)
    }
}
