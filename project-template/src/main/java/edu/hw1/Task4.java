package edu.hw1;

public class Task4 {
    String fixedString;
    Task4(String str){
        fixedString = fixString(str);
    }
    public static String fixString(String str){
        char[] res = str.toCharArray();
        for(int i = 0; i < res.length - 1; i += 2){
            char temp = res[i];
            res[i] = res[i+1];
            res[i+1] = temp;
        }
        return new String(res);
    }
}
