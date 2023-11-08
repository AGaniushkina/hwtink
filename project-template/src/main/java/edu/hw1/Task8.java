package edu.hw1;

public class Task8 {
    boolean isSafePositions;

    Task8(int[][] mas) {
        isSafePositions = knightBoardCapture(mas);
    }

    public static boolean knightBoardCapture(int[][] mas) {

        int[][] steps = new int[][] {{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};

        boolean result = true;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (mas[i][j] == 1) {
//                    if (((i > 2) && (j > 1) && (mas[i - 2][j - 1] == 1)) ||
//                        ((i > 2) && (j < 7) && (mas[i - 2][j + 1] == 1)) ||
//                        ((i > 1) && (j < 6) && (mas[i - 1][j + 2] == 1)) ||
//                        ((i < 7) && (j < 6) && (mas[i + 1][j + 2] == 1)) ||
//                        ((i < 6) && (j > 1) && (mas[i + 2][j - 1] == 1)) ||
//                        ((i < 6) && (j < 7) && (mas[i + 2][j + 1] == 1)) ||
//                        ((i > 1) && (j > 2) && (mas[i - 1][j - 2] == 1)) ||
//                        ((i < 7) && (j > 2) && (mas[i + 1][j - 2] == 1))) {
//                        result = false;
//                        break;
//                    }
                    for (int[] direct : steps) {
                        if (isValuePosition(i + direct[0]) && isValuePosition(j + direct[1]) &&
                            mas[i + direct[0]][j + direct[1]] == 1) {
                            result = false;
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }

    private static boolean isValuePosition(int value) {
        return value >= 0 && value < 8;
    }
}

