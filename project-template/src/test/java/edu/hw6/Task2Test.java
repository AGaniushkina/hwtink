package edu.hw6;

import edu.hw6.Task2.Task2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    @AfterEach
    public void afterEach() {
        List<String> postfixes = List.of("", " (1)", " (2)");

        postfixes.forEach(postfix -> Path.of("src", "main", "java", "edu", "hw6", "Task2")
            .resolve("Tinkoff_Bank_Biggest_Secret — копия" + postfix + ".txt")
            .toFile()
            .delete());
    }

    @Test
    @DisplayName("Клонирование файла")
    void cloneFileTest1() {
        // given
        Path parentFile = Path.of("src", "main", "java", "edu", "hw6", "Task2");
        Path dataFile = parentFile
            .resolve("Tinkoff_Bank_Biggest_Secret.txt");

        // when
        Task2.cloneFile(dataFile);

        // then
        assertThat(parentFile.resolve("Tinkoff_Bank_Biggest_Secret — копия.txt").toFile().exists())
            .isEqualTo(true);
    }

}
