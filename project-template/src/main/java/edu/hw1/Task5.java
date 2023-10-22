package edu.hw1;

public class Task5 {
    boolean isPalindrom;
    Task5(Integer x){
        isPalindrom = isPalindromeDescendant(x);
    }
    public static boolean isPalindromeDescendant(Integer x){
        boolean f = false;
        StringBuilder strInt = new StringBuilder(x.toString());
        while(strInt.length() > 1 && !f){
            f = strInt.toString().equals(new StringBuilder(strInt.toString()).reverse().toString());

            StringBuilder temp = new StringBuilder();
            for(int i = 0; i < strInt.length() - 1; i += 2){
                temp.append(Integer.parseInt(String.valueOf(strInt.charAt(i))) + Integer.parseInt(String.valueOf(strInt.charAt(i+1))));
            }
            if(strInt.length() %2 != 0){
                temp.append(strInt.charAt(strInt.length() - 1));
            }
            strInt = temp;
            //if (!f) System.out.println(strInt.toString());
        }
        return f;
    }
}
