package hw7;

import edu.hw7.Task4;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {
    @Test
    @DisplayName("Число пи")
    void calculatePISingleThreadTest1() {
        // given
        Task4 pi = new Task4();

        // when
        double res = pi.calculatePISingleThread(10000000);

        // then
        assertEquals(Math.PI, res, 0.001);
    }

    @Test
    @DisplayName("Число пи")
    void calculatePIMultipleThreadTest1() throws Exception {
        // when
        double res = Task4.calculatePIMultipleThread(10000000, 2);

        // then
        assertEquals(Math.PI, res, 0.001);
    }

}
