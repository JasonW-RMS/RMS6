package com.rms

/**
 * @author johnnywey
 * Date: 7/31/12
 */
public enum ContactMethod {

    PHONE("PHONE"), EMAIL("EMAIL"), WEB("WEB"), FORM("FORM")

    private final String name

    ContactMethod(String nameIn) {
        name = nameIn
    }

    String toString() {
        name
    }
}