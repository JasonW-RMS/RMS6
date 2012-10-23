package com.rms

/**
 * @author johnnywey
 * Date: 7/31/12
 */
public enum AddressType {

    MAILING("MAILING"), TAX("TAX"), BILLING("BILLING")

    private final String name

    AddressType(String nameIn) {
        name = nameIn
    }

    String toString() {
        name
    }
}