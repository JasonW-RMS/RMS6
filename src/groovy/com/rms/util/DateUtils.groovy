package com.rms.util

import org.apache.commons.lang.StringUtils

import java.text.SimpleDateFormat

/**Jason Wiles  (IntelliJ IDEA)
 * 10/4/12 - 12:00 PM 
 */

class DateUtils {
    private static final SimpleDateFormat MM_DD_YYYY = new SimpleDateFormat("MM/dd/yyyy")
    private static final SimpleDateFormat MM_DD_YYYY_HHMM = new SimpleDateFormat("MM/dd/yyyy HH:mm")

    public static Date parseDate(String date) {
        def d
        try {
            d = MM_DD_YYYY.parse(date)
            if (!StringUtils.equals(MM_DD_YYYY.format(d), date)) {
                return null
            }
        } catch (Exception e) {
            // Nothing
        }
        return d
    }

    public static Date parseDateTime(String date, Integer hour, Integer minute) {
        def d
        try {
            d = MM_DD_YYYY_HHMM.parse(date + " " + hour + ":" + minute)
        } catch (Exception e) {
            // Nothing
        }
    }
}

