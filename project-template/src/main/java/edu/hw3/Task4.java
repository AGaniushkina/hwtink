package edu.hw3;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static Integer x;
    public static Map<Integer, String> dictionary = new HashMap<Integer, String>();

    public Task4(Integer num) {
        x = num;
        dictionary.put(1000, "M");
        dictionary.put(500, "D");
        dictionary.put(100, "C");
        dictionary.put(50, "L");
        dictionary.put(10, "X");
        dictionary.put(5, "V");
        dictionary.put(1, "I");
    }

    public static String convertToRoman() {
        StringBuilder res = new StringBuilder();
        if (x < 0 || x == null) {
            throw new IllegalArgumentException();
        } else if (x == 0) {
            return res.append("0").toString();
        } else {

            while (x >= 1000) {

                res.append(dictionary.get(1000));
                x -= 1000;

            }
            while (x >= 500) {

                res.append(dictionary.get(500));
                x -= 500;
            }
            while (x >= 100) {

                res.append(dictionary.get(100));
                x -= 100;
            }
            while (x >= 50) {

                res.append(dictionary.get(50));
                x -= 50;
            }
            while (x >= 10) {

                res.append(dictionary.get(10));
                x -= 10;
            }
            while (x >= 5) {

                res.append(dictionary.get(5));
                x -= 5;
            }
            while (x >= 1) {

                res.append(dictionary.get(1));
                x -= 1;
            }
            return res.toString();
        }
    }

}
