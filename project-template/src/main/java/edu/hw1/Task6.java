package edu.hw1;

import java.util.Arrays;

public class Task6 {
    int count;

    Task6(Integer x) {
        count = countK(x);
    }

    public static int countK(Integer x) {
        int i = 0;
        if (x > 1000 && x < 10000) {
//&& !Arrays.stream(sameNum).collect(Collectors.toList()).contains(x)
            while (x != 6174) {
                char[] y = x.toString().toCharArray();
                Arrays.sort(y);
                x = Integer.parseInt((new StringBuilder(String.valueOf(y)).reverse()).toString()) -
                    Integer.parseInt(String.valueOf(y));
                if (x == 0) {
                    return -1; //Проверка что число не состоит из одинаковых цифр
                }
                i++;
            }
        } else {
            return -1;
        }
        return i;
    }
}
