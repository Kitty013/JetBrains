package com.company.doc;

import java.util.Scanner;

public class PrintingStringsInTheSameOrder {
    /** Write a program that reads four words and
     *  outputs them in the same order, each in a new line.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.next();
        String secondInput = scanner.next();
        String thirdInput = scanner.next();
        String forthInput = scanner.next();
        System.out.println(firstInput);
        System.out.println(secondInput);
        System.out.println(thirdInput);
        System.out.println(forthInput);
    }
}
