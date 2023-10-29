package edu.hw3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Task1("Hello world!").atbash());
        System.out.println(Task3.freqDict(Arrays.asList("this", "and", "that", "and")));
        System.out.println(Task3.freqDict(Arrays.asList(1, 1, 2, 2)));
        System.out.println(new Task4(100).convertToRoman());
    }
}
