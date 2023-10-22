package edu.hw1;

public class Task8 {
    boolean isSafePositions;
    Task8(Integer[][] mas){
        isSafePositions = knightBoardCapture(mas);
    }

    public static boolean knightBoardCapture(Integer[][] mas){

        boolean result = true;

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(mas[i][j] == 1){
                    if(((i > 2) && (j > 1) && (mas[i - 2][j - 1] == 1)) ||
                        ((i > 2) && (j < 7) && (mas[i - 2][j + 1] == 1)) ||
                        ((i > 1) && (j < 6) && (mas[i - 1][j + 2] == 1)) ||
                        ((i < 7) && (j < 6) && (mas[i + 1][j + 2] == 1)) ||
                        ((i < 6) && (j > 1) && (mas[i + 2][j - 1] == 1)) ||
                        ((i < 6) && (j < 7) && (mas[i + 2][j + 1] == 1)) ||
                        ((i > 1) && (j > 2) && (mas[i - 1][j - 2] == 1)) ||
                        ((i < 7) && (j > 2) && (mas[i + 1][j - 2] == 1))){
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }
}

