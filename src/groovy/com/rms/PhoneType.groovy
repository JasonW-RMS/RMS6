package com.rms

/**
 * @author johnnywey
 * Date: 7/31/12
 */
public enum PhoneType {

    HOME("HOME"), CELL("CELL"), OFFICE("OFFICE"), FAX("FAX"), OTHER("OTHER"), EMERGENCY("EMERGENCY")

    private final String type

    PhoneType(String typeIn) {
        type = typeIn
    }

    String toString() {
        type
    }
}