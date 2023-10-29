package edu.hw1;

import java.util.Arrays;

public class Task6 {
    int count;
    Task6(Integer x){
        count = countK(x);
    }
    public static int countK(Integer x){
        int i = 0;
        if (x > 1000 && x < 10000){

            while (x != 6174){
                char[] y = x.toString().toCharArray();
                Arrays.sort(y);
                x = Integer.parseInt((new StringBuilder(String.valueOf(y)).reverse()).toString()) - Integer.parseInt(String.valueOf(y));
                i++;
            }
        }
        else return -1;
        return i;
    }
}
