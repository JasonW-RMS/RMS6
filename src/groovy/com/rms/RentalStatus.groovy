package com.rms

/**
 * @author johnnywey
 * Date: 7/31/12
 */
public enum RentalStatus {

    SHORT("SHORT"), LONG("LONG"), BOTH("BOTH")

    private final String name

    RentalStatus(String nameIn) {
        name = nameIn
    }

    String toString() {
        name
    }
}