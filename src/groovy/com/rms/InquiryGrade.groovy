package com.rms

/**
 * @author johnnywey
 * Date: 7/31/12
 */
public enum InquiryGrade {

    LOW("LOW"), MEDIUM("MEDIUM"), HIGH("HIGH")

    private final String name

    InquiryGrade(String nameIn) {
        name = nameIn
    }

    String toString() {
        name
    }
}