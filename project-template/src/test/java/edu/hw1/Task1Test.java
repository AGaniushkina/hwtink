package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("Перевод минут в секунды")
    void convertMinutesToSeconds() {
        // given
        String str = "01:00";

        // when
        int secondsValue = Task1.minutesToSeconds(str);

        // then
        assertThat(secondsValue)
            .isEqualTo(60);
    }

    @Test
    @DisplayName("Перевод минут в секунды")
    void convertMinutesToSeconds2() {
        // given
        String str = "13:56";

        // when
        int secondsValue = Task1.minutesToSeconds(str);

        // then
        assertThat(secondsValue)
            .isEqualTo(836);
    }

    @Test
    @DisplayName("Перевод минут в секунды, некорректное количество секунд")
    void convertMinutesToSeconds3() {
        // given
        String str = "10:60";

        // when
        int secondsValue = Task1.minutesToSeconds(str);

        // then
        assertThat(secondsValue)
            .isEqualTo(-1);
    }

    @Test
    @DisplayName("Перевод минут в секунды, некорректное количество секунд")
    void convertMinutesToSeconds4() {
        // given
        String str = "01:99";

        // when
        int secondsValue = Task1.minutesToSeconds(str);

        // then
        assertThat(secondsValue)
            .isEqualTo(-1);
    }

    @Test
    @DisplayName("Перевод минут в секунды, некорректная строка")
    void convertMinutesToSeconds5() {
        // given
        String str = "1356";

        // when
        int secondsValue = Task1.minutesToSeconds(str);

        // then
        assertThat(secondsValue)
            .isEqualTo(-2);
    }

}
