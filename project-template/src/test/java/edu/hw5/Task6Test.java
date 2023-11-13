package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6Test {

    @Test
    @DisplayName("Поиск подпоследовательности")
    void isSubstringTest1() {
        // given
        String t = "achfdbaabgabcaabg";
        String s = "abc";

        // when
        boolean isSubstring = Task6.isSubstring(t, s);

        // then
        assertThat(isSubstring)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Поиск подпоследовательности")
    void isSubstringTest2() {
        // given
        String t = "achfdbaabgcaabg";
        String s = "abc";

        // when
        boolean isSubstring = Task6.isSubstring(t, s);

        // then
        assertThat(isSubstring)
            .isEqualTo(false);
    }
}
