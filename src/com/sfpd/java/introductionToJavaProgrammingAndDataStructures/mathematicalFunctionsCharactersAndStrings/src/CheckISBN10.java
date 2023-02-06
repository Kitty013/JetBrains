package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class CheckISBN10 {
    /*  Rewrite CheckISBN.java by entering the ISBN number as a string. */
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first 9 digits of your ISBN: ");
            String isbn = input.nextLine();

            int isbnNr = Integer.parseInt(isbn);

            int d9 = (isbnNr % 10);
            int d8 = (isbnNr / 10) % 10;
            int d7 = (isbnNr / 100) % 10;
            int d6 = (isbnNr / 1000) % 10;
            int d5 = (isbnNr / 10000) % 10;
            int d4 = (isbnNr / 100000) % 10;
            int d3 = (isbnNr / 1000000) % 10;
            int d2 = (isbnNr / 10000000) % 10;
            int d1 = (isbnNr / 100000000) % 10;
            int d10 = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;

            if (d10 < 10) {
                System.out.println(" " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
            } else {
                System.out.println(" " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
            }
    }
}