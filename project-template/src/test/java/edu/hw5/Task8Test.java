package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task8Test {

    @Test
    @DisplayName("Выражение нечетной длины")
    void isValidTest1() {
        // given
        String str = "101";

        // when
        boolean isValid = Task8.isValid(str, Task8.getREG1());

        // then
        assertThat(isValid)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Выражение нечетной длины")
    void isValidTest2() {
        // given
        String str = "11";

        // when
        boolean isValid = Task8.isValid(str, Task8.getREG1());

        // then
        assertThat(isValid)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Выражение нечетной длины")
    void isValidTest3() {
        // given
        String str = "120";

        // when
        boolean isValid = Task8.isValid(str, Task8.getREG1());

        // then
        assertThat(isValid)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Выражение начинается с 0 и имеет нечетную длину, или начинается с 1 и имеет четную длину")
    void isValidTest4() {
        // given
        String str = "01101";

        // when
        boolean isValid = Task8.isValid(str, Task8.getREG2());

        // then
        assertThat(isValid)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Выражение начинается с 0 и имеет нечетную длину, или начинается с 1 и имеет четную длину")
    void isValidTest5() {
        // given
        String str = "100101";

        // when
        boolean isValid = Task8.isValid(str, Task8.getREG2());

        // then
        assertThat(isValid)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Выражение начинается с 0 и имеет нечетную длину, или начинается с 1 и имеет четную длину")
    void isValidTest6() {
        // given
        String str = "0110";

        // when
        boolean isValid = Task8.isValid(str, Task8.getREG2());

        // then
        assertThat(isValid)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Выражение начинается с 0 и имеет нечетную длину, или начинается с 1 и имеет четную длину")
    void isValidTest7() {
        // given
        String str = "10010";

        // when
        boolean isValid = Task8.isValid(str, Task8.getREG2());

        // then
        assertThat(isValid)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Выражение каждый нечетный символ равен 1")
    void isValidTest8() {
        // given
        String str = "101011";

        // when
        boolean isValid = Task8.isValid(str, Task8.getREG5());

        // then
        assertThat(isValid)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Выражение каждый нечетный символ равен 1")
    void isValidTest9() {
        // given
        String str = "10011";

        // when
        boolean isValid = Task8.isValid(str, Task8.getREG5());

        // then
        assertThat(isValid)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Выражение нет последовательных 1")
    void isValidTest10() {
        // given
        String str = "10011";

        // when
        boolean isValid = Task8.isValid(str, Task8.getREG7());

        // then
        assertThat(isValid)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Выражение нет последовательных 1")
    void isValidTest11() {
        // given
        String str = "1001";

        // when
        boolean isValid = Task8.isValid(str, Task8.getREG7());

        // then
        assertThat(isValid)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Выражение нет последовательных 1")
    void isValidTest12() {
        // given
        String str = "10101";

        // when
        boolean isValid = Task8.isValid(str, Task8.getREG7());

        // then
        assertThat(isValid)
            .isEqualTo(true);
    }


}
