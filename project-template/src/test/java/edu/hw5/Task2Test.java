package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {

    @Test
    @DisplayName("Пятница 13 все дни за год")
    void getAll13FridaysTest1() {
        // given
        int year = 1925;

        // when
        List<LocalDate> fridays13InYear = Task2.getAll13Fridays(year);

        // then
        assertThat(fridays13InYear.toString())
            .isEqualTo("[1925-02-13, 1925-03-13, 1925-11-13]");
    }

    @Test
    @DisplayName("Пятница 13 все дни за год")
    void getAll13FridaysTest2() {
        // given
        int year = 2024;

        // when
        List<LocalDate> fridays13InYear = Task2.getAll13Fridays(year);

        // then
        assertThat(fridays13InYear.toString())
            .isEqualTo("[2024-09-13, 2024-12-13]");
    }

    @Test
    @DisplayName("Ближайшая пятница 13")
    void getNearest13FridaysTest1() {
        // given
        LocalDate date = LocalDate.of(2023, 8, 13);

        // when
        LocalDate dayFriday13 = Task2.getNearest13Fridays(date);

        // then
        assertThat(dayFriday13.toString())
            .isEqualTo("2023-10-13");
    }

}
