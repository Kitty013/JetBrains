package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class VowelOrConsonant {
    /*  Write a program that prompts the user to enter a letter and check whether the letter is a vowel or consonant.
        For a nonletter input, display invalid input.
        Sample run:
            Enter a letter: B
            B is a consonant

            Enter a letter: a
            a is a vowel

            Enter a letter: #
            # is an invalid input
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter = input.next().toLowerCase();
        String consonant = "zrtypmlkjhgfdsqwxcvbn";

        if(letter.equals("a")||letter.equals("e")||letter.equals("u")||letter.equals("i")||letter.equals("o")){
            System.out.println(letter + " is a vowel");
        } else if(consonant.contains(letter)){
            System.out.println(letter + " is a consonant");
        } else {
            System.out.println(letter + " is an invalid input");
        }
    }
}
