package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class ProcessAString {
    /*  Write a program that prompts the user to enter a string and displays its length and its last character. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String value = input.nextLine();
        int length = value.length();
        String character = value.substring(length - 1,length);
        System.out.println(length);
        System.out.println(character);
    }
}
