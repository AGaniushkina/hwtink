package edu.hw3;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static List<String> clusterize(String str) {

        List<String> clusters = new ArrayList<>();

        if (str == null || !(isCorrectBracketForm(str))) {
            return null;
        }

        int openBracketNum = 0;
        int closeBracketNum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                openBracketNum++;
            } else if (str.charAt(i) == ')') {
                closeBracketNum++;
                if (openBracketNum == closeBracketNum) {
                    clusters.add(str.substring(i - (openBracketNum + closeBracketNum - 1), i + 1));
                    openBracketNum = 0;
                    closeBracketNum = 0;
                }
            }
        }

        return clusters;
    }

    private static boolean isCorrectBracketForm(String str) {

        int openBracket = 0;
        int closeBracket = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                openBracket++;
            } else if (str.charAt(i) == ')') {
                closeBracket++;
                if (openBracket < closeBracket) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return openBracket == closeBracket;
    }
}
