package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5Test {
    @Test
    @DisplayName("Проверка является ли число палиндромом")
    void isPalindromeDescendantTest1() {
        // given
        Integer x = 11211230;

        // when
        boolean isPalindrome = Task5.isPalindromeDescendant(x);

        // then
        assertThat(isPalindrome)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Проверка является ли число палиндромом")
    void isPalindromeDescendantTest2() {
        // given
        Integer x = 13001120;

        // when
        boolean isPalindrome = Task5.isPalindromeDescendant(x);

        // then
        assertThat(isPalindrome)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Проверка является ли число палиндромом")
    void isPalindromeDescendantTest3() {
        // given
        Integer x = 23336014;

        // when
        boolean isPalindrome = Task5.isPalindromeDescendant(x);

        // then
        assertThat(isPalindrome)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Проверка является ли число палиндромом")
    void isPalindromeDescendantTest4() {
        // given
        Integer x = 11;

        // when
        boolean isPalindrome = Task5.isPalindromeDescendant(x);

        // then
        assertThat(isPalindrome)
            .isEqualTo(true);
    }
}
