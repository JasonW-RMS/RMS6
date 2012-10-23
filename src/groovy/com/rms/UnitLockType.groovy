package com.rms

/**
 * @author johnnywey
 * Date: 7/31/12
 */
public enum UnitLockType {

    KEY("KEY"), CARD("CARD"), LOCKBOX("LOCKBOX"), KABA("KABA")

    private final String type

    UnitLockType(String typeIn) {
        type = typeIn
    }

    String toString() {
        type
    }
}