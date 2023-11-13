package edu.hw5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

    private static final int dayOfMonth = 13;

    public static List<LocalDate> getAll13Fridays(int year) {

        List<LocalDate> fridays13InYear = new ArrayList<>();
        for (int month = 1; month < 13; month++) {
            LocalDate date = LocalDate.of(year, month, dayOfMonth);
            if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                fridays13InYear.add(date);
            }
        }
        return fridays13InYear;
    }

    public static LocalDate getNearest13Fridays(LocalDate date) {

        LocalDate dayFriday13 = date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        while (dayFriday13.getDayOfMonth() != dayOfMonth) {
            dayFriday13 = dayFriday13.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        }
        return dayFriday13;

    }

}
