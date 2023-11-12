package edu.hw3;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task3 {

    public static <T> Map<T, Integer> freqDict(List<T> words) {
        return words.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));
    }
}
