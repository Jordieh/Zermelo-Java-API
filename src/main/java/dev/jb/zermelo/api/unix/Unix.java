package dev.jb.zermelo.api.unix;

import java.util.Calendar;
import java.util.Date;

/**
 * Utility class for converting {@link Date} and {@link Calendar} objects to Unix Epoch timestamps
 */
public class Unix {

    private Unix() {
        throw new UnsupportedOperationException("<init> unsupported.");
    }

    public static long to(Calendar calendar) {
        return calendar.getTimeInMillis() / 1000L;
    }

    public static long to(Date date) {
        return date.getTime() / 1000L;
    }

    public static long now() {
        return System.currentTimeMillis() / 1000L;
    }

}
