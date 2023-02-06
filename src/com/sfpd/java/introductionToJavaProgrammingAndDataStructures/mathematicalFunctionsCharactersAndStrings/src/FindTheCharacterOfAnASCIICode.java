package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class FindTheCharacterOfAnASCIICode {
    /*  Write a program that receives a character and displays its ASCII code (an integer between 0 and 127)
        Sample run:
            Enter a character: E
            The ASCII code for character E is 69
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String character = input.next();
        char ch = character.charAt(0);
        int i = (int)ch;
        System.out.println("The ASCII code for character " + ch + " is " + i);
    }
}
