package edu.hw5;

public class Task4 {
    public static boolean isValidPassword(String password) {
        return password.matches(".*[~!@#$%^&*|].*");
    }

}
