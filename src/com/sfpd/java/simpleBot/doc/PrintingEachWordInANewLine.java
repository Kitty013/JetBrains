package com.sfpd.java.simpleBot.doc;

import java.util.Scanner;

public class PrintingEachWordInANewLine {
    /** Write a program that reads five words from the standard input and outputs
     *  each word in a new line. The words should be in the same order.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        String forthWord = scanner.next();
        String fifthWord = scanner.next();
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
        System.out.println(forthWord);
        System.out.println(fifthWord);
    }
}
