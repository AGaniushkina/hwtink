package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {
    @Test
    @DisplayName("Подсчет количества слов")
    void freqDictTest1() {
        // given
        List<String> wordsStr = Arrays.asList("this", "and", "that", "and");

        // when
        Map<?, Integer> dict = Task3.freqDict(wordsStr);

        // then
        assertThat(dict.toString())
            .isEqualTo("{that=1, and=2, this=1}");
    }

    @Test
    @DisplayName("Подсчет количества слов")
    void freqDictTest2() {
        // given
        List<String> wordsStr = Arrays.asList("код", "код", "код", "bug");

        // when
        Map<?, Integer> dict = Task3.freqDict(wordsStr);

        // then
        assertThat(dict.toString())
            .isEqualTo("{код=3, bug=1}");
    }

    @Test
    @DisplayName("Подсчет количества слов")
    void freqDictTest3() {
        // given
        List wordsStr = Arrays.asList(1, 1, 2, 2);

        // when
        Map<?, Integer> dict = Task3.freqDict(wordsStr);

        // then
        assertThat(dict.toString())
            .isEqualTo("{1=2, 2=2}");
    }

}
