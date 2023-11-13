package edu.hw5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Task1 {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm");

    public static String getSessionTime(List<String> params) {
        if (params.isEmpty()) {
            return "0ч 0м";
        }
        Duration duration = Duration.ZERO;

        for (String param : params) {
            String[] interval = param.split(" - ");
            LocalDateTime start = LocalDateTime.parse(interval[0], DATE_TIME_FORMATTER);
            LocalDateTime end = LocalDateTime.parse(interval[1], DATE_TIME_FORMATTER);
            duration = duration.plus(Duration.between(start, end));
        }
        long minutes = duration.dividedBy(params.size()).toMinutes();
        return String.format("%dч %dм", minutes / 60, minutes % 60);
    }

}
