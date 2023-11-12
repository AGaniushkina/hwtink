package edu.hw3;

import edu.hw3.Task8.BackwardIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task8Test {
    @Test
    @DisplayName("Обратный итератор")
    public void backwardIteratorTest1() {
        Iterator<Integer> iterator = new BackwardIterator<>(List.of(1, 2, 3));
        assertEquals(3, iterator.next());
        assertEquals(2, iterator.next());
        assertEquals(1, iterator.next());
    }

    @Test
    @DisplayName("Обратный итератор")
    public void backwardIteratorTest2() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Iterator<Integer> iterator = new BackwardIterator<>(stack);
        assertEquals(3, iterator.next());
        assertEquals(2, iterator.next());
        assertEquals(1, iterator.next());
    }
}
