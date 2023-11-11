package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public final class Main {
    private final static Logger LOGGER = LogManager.getLogger();

    private Main() {
    }

    public static void main(String[] args) {

        LOGGER.info("Hello world!");

        Scanner in = new Scanner(System.in);

        System.out.println((new Task1(in.next()).secondsCount)); //формат ввода: 13:56
        System.out.println((new Task2(in.nextInt()).digitsCount)); //формат ввода:
        System.out.println((new Task3(new Integer[] {1, 2, 3, 4}, new Integer[] {0, 6}).nestable));
        System.out.println((new Task4(in.next()).fixedString)); //формат ввода: hTsii  s aimex dpus rtni.g
        System.out.println((new Task5(in.nextInt()).isPalindrom)); //формат ввода: 11211230
        System.out.println((new Task6(in.nextInt()).count)); //формат ввода: 6621
        System.out.println((new Task7(in.nextInt(), in.nextInt()).rotetedLeft));
        System.out.println((new Task7(in.nextInt(), in.nextInt()).rotetedRight));
        System.out.println((new Task8(new int[][] {
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0}}).isSafePositions));
    }
}
