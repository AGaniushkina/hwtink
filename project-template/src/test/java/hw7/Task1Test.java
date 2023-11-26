package hw7;

import edu.hw7.Task1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("Увеличение счетчика")
    void incrementTest1() throws InterruptedException {
        // given
        Task1 counter = new Task1();

        // when
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                counter.increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                counter.increment();
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        // then
        assertThat(counter.getCounter())
            .isEqualTo(300);
    }

}
