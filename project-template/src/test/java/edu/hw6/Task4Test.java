package edu.hw6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {
    @Test
    @DisplayName("Композиция OutputStream'ов")
    void composeTest1() {
        // given
        List<String> rows;

        // when
        new Task4().compose("Task4Test");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Task4Test"))) {
            rows = bufferedReader.lines().toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // then
        assertEquals("Programming is learned by writing programs. ― Brian Kernighan", rows.get(0));
        assertEquals(1, rows.size());

    }
}
