package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {

    @Test
    @DisplayName("Кластеризация скобок")
    void clusterizeTest1() {
        // given
        String str = "()()()";

        // when
        List<String> clusters = Task2.clusterize(str);

        // then
        assertThat(clusters)
            .isEqualTo(List.of("()", "()", "()"));
    }

    @Test
    @DisplayName("Кластеризация скобок")
    void clusterizeTest2() {
        // given
        String str = "((()))";

        // when
        List<String> clusters = Task2.clusterize(str);

        // then
        assertThat(clusters)
            .isEqualTo(List.of("((()))"));
    }

    @Test
    @DisplayName("Кластеризация скобок")
    void clusterizeTest3() {
        // given
        String str = "((()))(())()()(()())";

        // when
        List<String> clusters = Task2.clusterize(str);

        // then
        assertThat(clusters)
            .isEqualTo(List.of("((()))", "(())", "()", "()", "(()())"));
    }

    @Test
    @DisplayName("Кластеризация скобок")
    void clusterizeTest4() {
        // given
        String str = "((())())(()(()()))";

        // when
        List<String> clusters = Task2.clusterize(str);

        // then
        assertThat(clusters)
            .isEqualTo(List.of("((())())", "(()(()()))"));
    }

    @Test
    @DisplayName("Кластеризация скобок")
    void clusterizeTest5() {
        // given
        String str = "((())))";

        // when
        List<String> clusters = Task2.clusterize(str);

        // then
        assertThat(clusters)
            .isEqualTo(null);
    }

}
