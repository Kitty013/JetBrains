package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class FindTheUnicodeOfACharacter {
    /*  Write a program that receives a character and displays its Unicode.
        Sample Run:
            Enter a character: E
            The Unicode for the character E is 69.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String data = input.next();
        char ch = data.charAt(0);
        int unicode = (int)ch;
        System.out.println("The Unicode for the character " + ch + " is " + "U00" + unicode);
    }
}
