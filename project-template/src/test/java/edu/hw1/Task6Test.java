package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6Test {
    @Test
    @DisplayName("Количество шагов для достижения постоянной Капрекара")
    void countKTest1() {
        // given
        Integer x = 6621;

        // when
        int countK = Task6.countK(x);

        // then
        assertThat(countK)
            .isEqualTo(5);
    }

    @Test
    @DisplayName("Количество шагов для достижения постоянной Капрекара")
    void countKTest2() {
        // given
        Integer x = 1234;

        // when
        int countK = Task6.countK(x);

        // then
        assertThat(countK)
            .isEqualTo(3);
    }

    @Test
    @DisplayName("Количество шагов для достижения постоянной Капрекара")
    void countKTest3() {
        // given
        Integer x = 6554;

        // when
        int countK = Task6.countK(x);

        // then
        assertThat(countK)
            .isEqualTo(4);
    }

    @Test
    @DisplayName("Количество шагов для достижения постоянной Капрекара. Некорректное число")
    void countKTest4() {
        // given
        Integer x = 321;

        // when
        int countK = Task6.countK(x);

        // then
        assertThat(countK)
            .isEqualTo(-1);
    }
}
