package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {
    @Test
    @DisplayName("Исправление строки")
    void fixStringTest1() {
        // given
        String str = "123456";

        // when
        String fixedStr = Task4.fixString(str);

        // then
        assertThat(fixedStr)
            .isEqualTo("214365");
    }

    @Test
    @DisplayName("Исправление строки")
    void fixStringTest2() {
        // given
        String str = "hTsii  s aimex dpus rtni.g";

        // when
        String fixedStr = Task4.fixString(str);

        // then
        assertThat(fixedStr)
            .isEqualTo("This is a mixed up string.");
    }

    @Test
    @DisplayName("Исправление строки")
    void fixStringTest3() {
        // given
        String str = "badce";

        // when
        String fixedStr = Task4.fixString(str);

        // then
        assertThat(fixedStr)
            .isEqualTo("abcde");
    }
}
