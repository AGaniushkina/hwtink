package edu.hw3;

public class Task1 {

    public static String atbash(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c) && ((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z'))) {
                result.append(Character.isLowerCase(c) ?
                    (char) ('z' + 'a' - c) : (char) ('Z' + 'A' - c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

}
