package edu.hw5;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println(Task4.isValidPassword("password"));

        System.out.println(Task5.isValidCarNumber("А123ВЕ777"));
        System.out.println(Task5.isValidCarNumber("А123ВЕ7777"));

        System.out.println(Task6.isSubstring("achfdbaabgabcaabg", "abc"));

        System.out.println(Task7.isValid("101", Task7.getREG1()));
        System.out.println(Task7.isValid("1001", Task7.getREG1()));

        System.out.println(Task2.getAll13Fridays(1925));
        System.out.println(Task2.getNearest13Fridays(LocalDate.of(2023, 8, 13)));

    }
}
