package edu.hw3;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task3 {
//    public static Map<String, Integer> dict = new HashMap<String, Integer>();
//
//    Task2(ArrayList<String> words) {
//        dict = freqDict(words);
//    }

    public static Map<?, Integer> freqDict(List<?> words) {
        Map<?, Integer> collect = words.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));
        return collect;
    }

}
