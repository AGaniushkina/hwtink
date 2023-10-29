package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("Шифр Атбаш")
    void atbashTest1() {
        // given
        String str = "Hello world!";

        // when
        String atbashStr = new Task1(str).atbash();

        // then
        assertThat(atbashStr)
            .isEqualTo("Svool dliow!");
    }
    @Test
    @DisplayName("Шифр Атбаш")
    void atbashTest2() {
        // given
        String str = "Any fool can write code that a computer can understand. Good programmers write code that humans can understand. ― Martin Fowler";

        // when
        String atbashStr = new Task1(str).atbash();

        // then
        assertThat(atbashStr)
            .isEqualTo("Zmb ullo xzm dirgv xlwv gszg z xlnkfgvi xzm fmwvihgzmw. Tllw kiltiznnvih dirgv xlwv gszg sfnzmh xzm fmwvihgzmw. ― Nzigrm Uldovi");
    }

}
