package com.rms

/**
 * @author johnnywey
 * Date: 7/31/12
 */
public enum BankAccountType {

    CHECKING("CHECKING"), SAVINGS("SAVINGS"), BUSINESS("BUSINESS")

    private final String type

    BankAccountType(String typeIn) {
        type = typeIn
    }

    String toString() {
        type
    }
}