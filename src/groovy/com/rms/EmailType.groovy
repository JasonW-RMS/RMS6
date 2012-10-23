package com.rms

/**
 * @author johnnywey
 * Date: 7/31/12
 */
public enum EmailType {
    PRIMARY("PRIMARY"), OTHER("OTHER"), EMERGENCY("EMERGENCY")

    private final String type

    EmailType(String typeIn) {
        type = typeIn
    }

    String toString() {
        type
    }
}