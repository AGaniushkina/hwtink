package edu.hw5;

public class Task7 {

    private static final String REG1 = "^(0|1){2}0(0|1)*$";
    private static final String REG2 = "^1(0|1)*1$|^0(0|1)*0$";
    private static final String REG3 = "^(0|1){1,3}$";

    public static boolean isValid(String str, String reg) {
        return str.matches(reg);
    }

    public static String getREG1() {
        return REG1;
    }

    public static String getREG2() {
        return REG2;
    }

    public static String getREG3() {
        return REG3;
    }
}
