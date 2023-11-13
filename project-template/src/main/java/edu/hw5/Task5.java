package edu.hw5;

public class Task5 {
    private static final String REGCN = "^[А-Я][0-9]{2}[1-9][А-Я]{2}[0-9]{2}[1-9]$";

    public static boolean isValidCarNumber(String password) {
        return password.matches(REGCN);
    }
}
