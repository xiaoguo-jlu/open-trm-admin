package com.qingmu.web.infrastructure;

public interface DateConstants {
    String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";
    String DEFAULT_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    String DEFAULT_TIMEZONE = "GMT";

    enum DataFlag {
        Y("Y"), N("N");

        public final char[] value;

        DataFlag(String flagValue) {
            value = flagValue.toCharArray();
        }
    }
}
