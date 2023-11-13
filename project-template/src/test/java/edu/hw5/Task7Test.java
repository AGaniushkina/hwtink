package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task7Test {

    @Test
    @DisplayName("Выражение содержит не менее 3 символов, причем третий символ равен 0")
    void isValidTest1() {
        // given
        String str = "101";

        // when
        boolean isValid = Task7.isValid(str, Task7.getREG1());

        // then
        assertThat(isValid)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Выражение содержит не менее 3 символов, причем третий символ равен 0")
    void isValidTest2() {
        // given
        String str = "1001";

        // when
        boolean isValid = Task7.isValid(str, Task7.getREG1());

        // then
        assertThat(isValid)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Выражение содержит не менее 3 символов, причем третий символ равен 0")
    void isValidTest3() {
        // given
        String str = "10";

        // when
        boolean isValid = Task7.isValid(str, Task7.getREG1());

        // then
        assertThat(isValid)
            .isEqualTo(false);
    }
    @Test
    @DisplayName("Выражение содержит не менее 3 символов, причем третий символ равен 0")
    void isValidTest4() {
        // given
        String str = "120";

        // when
        boolean isValid = Task7.isValid(str, Task7.getREG1());

        // then
        assertThat(isValid)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Выражение начинается и заканчивается одним и тем же символом")
    void isValidTest5() {
        // given
        String str = "10";

        // when
        boolean isValid = Task7.isValid(str, Task7.getREG2());

        // then
        assertThat(isValid)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Выражение начинается и заканчивается одним и тем же символом")
    void isValidTest6() {
        // given
        String str = "101";

        // when
        boolean isValid = Task7.isValid(str, Task7.getREG2());

        // then
        assertThat(isValid)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Выражение начинается и заканчивается одним и тем же символом")
    void isValidTest7() {
        // given
        String str = "01110";

        // when
        boolean isValid = Task7.isValid(str, Task7.getREG2());

        // then
        assertThat(isValid)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Выражение начинается и заканчивается одним и тем же символом")
    void isValidTest8() {
        // given
        String str = "01210";

        // when
        boolean isValid = Task7.isValid(str, Task7.getREG2());

        // then
        assertThat(isValid)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Длина выражения не менее 1 и не более 3")
    void isValidTest9() {
        // given
        String str = "0110";

        // when
        boolean isValid = Task7.isValid(str, Task7.getREG3());

        // then
        assertThat(isValid)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Длина выражения не менее 1 и не более 3")
    void isValidTest10() {
        // given
        String str = "01";

        // when
        boolean isValid = Task7.isValid(str, Task7.getREG3());

        // then
        assertThat(isValid)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Длина выражения не менее 1 и не более 3")
    void isValidTest11() {
        // given
        String str = "";

        // when
        boolean isValid = Task7.isValid(str, Task7.getREG3());

        // then
        assertThat(isValid)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Длина выражения не менее 1 и не более 3")
    void isValidTest12() {
        // given
        String str = "120";

        // when
        boolean isValid = Task7.isValid(str, Task7.getREG3());

        // then
        assertThat(isValid)
            .isEqualTo(false);
    }

}
