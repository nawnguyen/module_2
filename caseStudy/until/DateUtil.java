package caseStudy.until;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm 'ngày' dd-MM-yyyy");

    public static String format(LocalDateTime dateTime) {
        return dateTime.format(formatter);
    }
}
