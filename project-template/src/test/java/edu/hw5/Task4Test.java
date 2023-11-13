package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {
    @Test
    @DisplayName("Безопасный пароль")
    void isValidPasswordTest1() {
        // given
        String password = "qwerty123";

        // when
        boolean isValidPassword = Task4.isValidPassword(password);

        // then
        assertThat(isValidPassword)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Безопасный пароль")
    void isValidPasswordTest2() {
        // given
        String password = "pas@word";

        // when
        boolean isValidPassword = Task4.isValidPassword(password);

        // then
        assertThat(isValidPassword)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Безопасный пароль")
    void isValidPasswordTest3() {
        // given
        String password = "a*c^e~g";
        // when
        boolean isValidPassword = Task4.isValidPassword(password);

        // then
        assertThat(isValidPassword)
            .isEqualTo(true);
    }

}
