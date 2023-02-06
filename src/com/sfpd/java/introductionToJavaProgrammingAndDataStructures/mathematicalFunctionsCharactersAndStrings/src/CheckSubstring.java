package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class CheckSubstring {
    /*  Write a program that prompts the user to enter two strings, and reports whether the second string is a substring
        of the first string.
        Sample run:
            Enter string s1: ABCD
            Enter string s2: BC
            BC is a substring of ABCD

            Enter string s1: ABCD
            Enter string s2: BDC
            BDC is not a substring of ABCD
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        String s1 = input.next().toUpperCase();
        System.out.println("Enter string s2: ");
        String s2 = input.next().toUpperCase();

        if (s1.contains(s2) == true) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
