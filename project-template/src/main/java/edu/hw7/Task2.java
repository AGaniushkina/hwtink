package edu.hw7;

import java.util.stream.LongStream;

public class Task2 {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Parameter `n` must be more or equals 0");
        }

        return LongStream.range(1, n + 1)
            .parallel()
            .reduce(1L, (acc, number) -> acc * number);
    }
}
