package com.rms

class Email {

    String emailAddress
    EmailType emailType = EmailType.PRIMARY

    String toString() { emailAddress }

    static constraints = {
        emailAddress(blank: false)
    }
}
