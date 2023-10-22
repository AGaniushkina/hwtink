package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    @Test
    @DisplayName("Количество цифр в десятичном формате")
    void countDigitsTest1() {
        // given
        int x = 4666;

        // when
        int countDigitsValue = Task2.countDigits(x);

        // then
        assertThat(countDigitsValue)
            .isEqualTo(4);
    }

    @Test
    @DisplayName("Количество цифр в десятичном формате")
    void countDigitsTest2() {
        // given
        int x = 544;

        // when
        int countDigitsValue = Task2.countDigits(x);

        // then
        assertThat(countDigitsValue)
            .isEqualTo(3);
    }

    @Test
    @DisplayName("Количество цифр в десятичном формате")
    void countDigitsTest3() {
        // given
        int x = 0;

        // when
        int countDigitsValue = Task2.countDigits(x);

        // then
        assertThat(countDigitsValue)
            .isEqualTo(1);
    }

    @Test
    @DisplayName("Количество цифр в десятичном формате, отрицательное число")
    void countDigitsTest4() {
        // given
        int x = -10;

        // when
        int countDigitsValue = Task2.countDigits(x);

        // then
        assertThat(countDigitsValue)
            .isEqualTo(2);
    }

}
