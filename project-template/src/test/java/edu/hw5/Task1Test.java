package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {

    @Test
    @DisplayName("Время сессии")
    void getSessionTimeTest1() {
        // given
        List<String> params = List.of("2022-03-12, 20:20 - 2022-03-12, 23:50", "2022-04-01, 21:30 - 2022-04-02, 01:20");

        // when
        String res = Task1.getSessionTime(params);

        // then
        assertThat(res)
            .isEqualTo("3ч 40м");
    }

}
