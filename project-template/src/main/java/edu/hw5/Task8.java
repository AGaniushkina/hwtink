package edu.hw5;

public class Task8 {
    private static final String REG1 = "^(1|0)((1|0){2})*$";
    private static final String REG2 = "^0((1|0){2})*$|^1((1|0){2})*+(1|0)$";
    private static final String REG5 = "^1((1|0)1)*(1|0)?$";
    private static final String REG7 = "(^(0+(1|0){0,1})*$)|(^(1(0)+)*1{0,1}$)";

    public static boolean isValid(String str, String reg) {
        return str.matches(reg);
    }

    public static String getREG1() {
        return REG1;
    }

    public static String getREG2() {
        return REG2;
    }

    public static String getREG5() {
        return REG5;
    }

    public static String getREG7() {
        return REG7;
    }

}
