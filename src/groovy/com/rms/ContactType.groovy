package com.rms

/**
 * @author johnnywey
 * Date: 7/31/12
 */
public enum ContactType {
    OWNER("OWNER"), GUEST("GUEST"), VENDOR("VENDOR")

    private final String type

    ContactType(String typeIn) {
        type = typeIn
    }

    String toString() {
        type
    }
}