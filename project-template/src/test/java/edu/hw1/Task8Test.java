package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task8Test {

    @Test
    @DisplayName("Проверка, что ни один конь не может захватить другого ")
    void knightBoardCaptureTest1() {
        // given
        Integer[][] mas = new Integer[][]{
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 0, 0}};

        // when
        boolean knightBoardCapture = Task8.knightBoardCapture(mas);

        // then
        assertThat(knightBoardCapture)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Проверка, что ни один конь не может захватить другого ")
    void knightBoardCaptureTest2() {
        // given
        Integer[][] mas = new Integer[][]{
            {1, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 1},
            {0, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 1, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 0, 1}};

        // when
        boolean knightBoardCapture = Task8.knightBoardCapture(mas);

        // then
        assertThat(knightBoardCapture)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Проверка, что ни один конь не может захватить другого ")
    void knightBoardCaptureTest3() {
        // given
        Integer[][] mas = new Integer[][]{
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0}};

        // when
        boolean knightBoardCapture = Task8.knightBoardCapture(mas);

        // then
        assertThat(knightBoardCapture)
            .isEqualTo(false);
    }
}
