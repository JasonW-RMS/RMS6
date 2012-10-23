package com.rms.util

import org.joda.time.format.DateTimeFormat
import org.joda.time.format.DateTimeFormatter

class Constants {
    // Shared date formatter.
    public final static DateTimeFormatter FORMATTER_MMDDYYYY = DateTimeFormat.forPattern("MM/dd/yyyy")
}

public enum ContentType {
    TEXT_JSON("text/json"), APPLICATION_JSON("application/json"), TEXT_XML("text/xml")

    private final String type


    ContentType(String typeIn) {
        type = typeIn
    }

    String getType() {
        type
    }

    @Override
    String toString() {
        type
    }
}
