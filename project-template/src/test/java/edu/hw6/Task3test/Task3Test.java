package edu.hw6.Task3test;

import edu.hw6.Task3.AbstractFilter;
import edu.hw6.Task3.Filter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    @Test
    @DisplayName("Абстрактный фильтр")
    void abstractFilterTest1() {
        // given
        Path filePath = Path.of("src", "test", "java", "edu", "hw6", "Task3test");
        AbstractFilter isReadable = Files::isReadable;

        // when
        DirectoryStream.Filter<Path> filter = isReadable
            .and(Files::exists)

            .and(Filter.globMatches("*.png"))
            .and(Filter.largerThan(1600 * 2))
            .and(Filter.regexContains("mag"));

        // then
        List<String> expectedFileNames = List.of("image.png");
        List<String> actualFileNames = new ArrayList<>();

        try (DirectoryStream<Path> entries = Files.newDirectoryStream(filePath, filter)) {
            entries.forEach(entry -> actualFileNames.add(entry.getFileName().toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals(expectedFileNames, actualFileNames);

    }
}
