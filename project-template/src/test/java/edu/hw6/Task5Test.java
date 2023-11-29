package edu.hw6;

import edu.hw6.Task5.HackerNews;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Task5Test {
    @Test
    @DisplayName("Получение названия новости по id")
    public void newsTest1() {
        //when
        String expected = new HackerNews().news(37570037);

        //then
        assertEquals(expected, "JDK 21 Release Notes");
    }

    @Test
    @DisplayName("Получение названия новости по id")
    public void newsTest2() {
        //when
        String result = new HackerNews().news(-1);

        //then
        assertNull(result);
    }

    @Test
    @DisplayName("Получение наиболее обсуждаемых новослей")
    public void hackerNewsTopStoriesTest1() {
        //when
        long[] result = new HackerNews().hackerNewsTopStories();

        //then
        assertNotNull(result);
    }

}
