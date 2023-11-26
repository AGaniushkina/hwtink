package hw7;

import edu.hw7.Task2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {

    @Test
    @DisplayName("Факториал")
    void factorialTest1() {
        //when
        double res = Task2.factorial(5);

        // then
        assertThat(res)
            .isEqualTo(120);
    }

    @Test
    @DisplayName("Факториал")
    void factorialTest2() {
        //when
        double res = Task2.factorial(3);

        // then
        assertThat(res)
            .isEqualTo(6);
    }

}
