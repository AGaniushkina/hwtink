package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {

    @Test
    @DisplayName("Проверка вложенности массивов")
    void isNestableTest1() {
        // given
        Integer[] mas1 = new Integer[]{1, 2, 3, 4};
        Integer[] mas2 = new Integer[]{0, 6};

        // when
        boolean isNestable = Task3.isNestable(mas1, mas2);

        // then
        assertThat(isNestable)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Проверка вложенности массивов")
    void isNestableTest2() {
        // given
        Integer[] mas1 = new Integer[]{3, 1};
        Integer[] mas2 = new Integer[]{4, 0};

        // when
        boolean isNestable = Task3.isNestable(mas1, mas2);

        // then
        assertThat(isNestable)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Проверка вложенности массивов")
    void isNestableTest3() {
        // given
        Integer[] mas1 = new Integer[]{9, 9, 8};
        Integer[] mas2 = new Integer[]{8, 9};

        // when
        boolean isNestable = Task3.isNestable(mas1, mas2);

        // then
        assertThat(isNestable)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Проверка вложенности массивов")
    void isNestableTest4() {
        // given
        Integer[] mas1 = new Integer[]{1, 2, 3, 4};
        Integer[] mas2 = new Integer[]{2, 3};

        // when
        boolean isNestable = Task3.isNestable(mas1, mas2);

        // then
        assertThat(isNestable)
            .isEqualTo(false);
    }
}
