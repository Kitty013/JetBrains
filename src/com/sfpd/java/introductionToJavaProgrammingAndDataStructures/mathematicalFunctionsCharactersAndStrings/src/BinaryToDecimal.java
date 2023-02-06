package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class BinaryToDecimal {
    /*   Write a program that prompts the user to enter binary digits and displays its corresponding decimal value.
         Sample run:
            Enter binary digit (0000 to 1111): 0111
            The decimal value is 7

            Enter binary digit (0000 to 1111): 1001
            The decimal value is 9

            Enter binary digit (0000 to 1111): 1100
            The decimal value is 12
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter binary digit (0000 to 1111): ");
        String binDig = input.nextLine();
        char binDig1 = binDig.charAt(0);
        char binDig2 = binDig.charAt(1);
        char binDig3 = binDig.charAt(2);
        char binDig4 = binDig.charAt(3);
        int num1 = 0;
        if (binDig1 == 49) {
            num1 = 8;
        } else {
            num1 = 0;
        }
        int num2 = 0;
        if (binDig2 == 49) {
            num2 = 4;
        } else {
            num2 = 0;
        }
        int num3 = 0;
        if (binDig3 == 49) {
            num3 = 2;
        } else {
            num3 = 0;
        }
        int num4 = 0;
        if (binDig4 == 49) {
            num4 = 1;
        } else {
            num4 = 0;
        }
        int decNum = num1 + num2 + num3 + num4;
        System.out.println("The decimal value is " + decNum);
    }
}
