package edu.hw1;

public class Task3 {
    boolean nestable;
    Task3(Integer[] mas1, Integer[] mas2){
        nestable = isNestable(mas1, mas2);
    }
    public static boolean isNestable(Integer[] mas1, Integer[] mas2){
        if((getMin(mas1) > getMin(mas2)) && (getMax(mas1) < getMax(mas2))){
            return true;
        }
        return false;
    }

    private static Integer getMin(Integer[] mas1) {
        Integer min = mas1[0];
        for(Integer i: mas1){
            if (i < min){
                min = i;
            }
        }
        return min;
    }
    private static Integer getMax(Integer[] mas1) {
        Integer max = mas1[0];
        for(Integer i: mas1){
            if (i > max){
                max = i;
            }
        }
        return max;
    }
}
