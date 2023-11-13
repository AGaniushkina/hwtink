package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5Test {
    @Test
    @DisplayName("Валидация российских номеров")
    void isValidCarNumberTest1() {
        // given
        String number = "А123ВЕ777";

        // when
        boolean isValidCarNumber = Task5.isValidCarNumber(number);

        // then
        assertThat(isValidCarNumber)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Валидация российских номеров")
    void isValidCarNumberTest2() {
        // given
        String number = "О777ОО177";

        // when
        boolean isValidCarNumber = Task5.isValidCarNumber(number);

        // then
        assertThat(isValidCarNumber)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Валидация российских номеров")
    void isValidCarNumberTest3() {
        // given
        String number = "123АВЕ777";

        // when
        boolean isValidCarNumber = Task5.isValidCarNumber(number);

        // then
        assertThat(isValidCarNumber)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Валидация российских номеров")
    void isValidCarNumberTest4() {
        // given
        String number = "А123ВГ77";

        // when
        boolean isValidCarNumber = Task5.isValidCarNumber(number);

        // then
        assertThat(isValidCarNumber)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Валидация российских номеров")
    void isValidCarNumberTest5() {
        // given
        String number = "А123ВЕ7777";

        // when
        boolean isValidCarNumber = Task5.isValidCarNumber(number);

        // then
        assertThat(isValidCarNumber)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Валидация российских номеров")
    void isValidCarNumberTest6() {
        // given
        String number = "О000ОО177";

        // when
        boolean isValidCarNumber = Task5.isValidCarNumber(number);

        // then
        assertThat(isValidCarNumber)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Валидация российских номеров")
    void isValidCarNumberTest7() {
        // given
        String number = "777";

        // when
        boolean isValidCarNumber = Task5.isValidCarNumber(number);

        // then
        assertThat(isValidCarNumber)
            .isEqualTo(false);
    }

}
