package com.rms

/**
 * @author johnnywey
 * Date: 7/31/12
 */
public enum TaxIdtype {

    FEDERAL("FEDERAL"), SSN("SSN")

    private final String name

    TaxIdtype(String nameIn) {
        name = nameIn
    }

    String toString() {
        name
    }
}