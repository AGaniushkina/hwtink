package edu.hw3;

import edu.hw3.Task4;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {
    @Test
    @DisplayName("Перевод в римскую систему счисления")
    void convertToRomanTest1() {
        // given
        int x = 100;

        // when
        String romanStr = new Task4(x).convertToRoman();

        // then
        assertThat(romanStr)
            .isEqualTo("C");
    }

    @Test
    @DisplayName("Перевод в римскую систему счисления")
    void convertToRomanTest2() {
        // given
        int x = 2;

        // when
        String romanStr = new Task4(x).convertToRoman();

        // then
        assertThat(romanStr)
            .isEqualTo("II");
    }

    @Test
    @DisplayName("Перевод в римскую систему счисления")
    void convertToRomanTest3() {
        // given
        int x = 12;

        // when
        String romanStr = new Task4(x).convertToRoman();

        // then
        assertThat(romanStr)
            .isEqualTo("XII");
    }

    @Test
    @DisplayName("Перевод в римскую систему счисления")
    void convertToRomanTest4() {
        // given
        int x = 16;

        // when
        String romanStr = new Task4(x).convertToRoman();

        // then
        assertThat(romanStr)
            .isEqualTo("XVI");
    }
}
