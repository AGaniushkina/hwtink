package edu.hw1;

public class Task1 {
    public int secondsCount;

    Task1(String str) {
        secondsCount = minutesToSeconds(str);
    }

    public static int minutesToSeconds(String str) {
        String[] strs = str.split(":");
        if (strs.length != 2) {
            return -2;
        }
        try {
            int min = Integer.parseInt(strs[0].trim());
            int sec = Integer.parseInt(strs[1].trim());
            if (sec >= 60) {
                return -1;
            } else {
                return min * 60 + sec;
            }
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
        return -2;
    }
}
