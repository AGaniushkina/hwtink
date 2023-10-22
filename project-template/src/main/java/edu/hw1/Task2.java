package edu.hw1;

public class Task2 {
    public int digitsCount;
    Task2(int x){
        digitsCount = countDigits(x);
    }
    public static int countDigits(int x){
        int res = 1;
        int i = 10;
        while(Math.abs(x) >= i){
            res += 1;
            i *= 10;
        }
        return res;
    }
}
