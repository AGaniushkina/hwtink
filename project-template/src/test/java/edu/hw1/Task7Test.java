package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task7Test {
    @Test
    @DisplayName("Циклический сдвиг вправо")
    void rotateRightTest1() {
        // given
        int n = 8;
        int shift = 1;

        // when
        int result = Task7.rotateRight(n, shift);

        // then
        assertThat(result)
            .isEqualTo(4);
    }

    @Test
    @DisplayName("Циклический сдвиг влево")
    void rotateLeftTest2() {
        // given
        int n = 16;
        int shift = 1;

        // when
        int result = Task7.rotateLeft(n, shift);

        // then
        assertThat(result)
            .isEqualTo(1);
    }

    @Test
    @DisplayName("Циклический сдвиг влево")
    void rotateLeftTest3() {
        // given
        int n = 17;
        int shift = 2;

        // when
        int result = Task7.rotateLeft(n, shift);

        // then
        assertThat(result)
            .isEqualTo(6);
    }
}
