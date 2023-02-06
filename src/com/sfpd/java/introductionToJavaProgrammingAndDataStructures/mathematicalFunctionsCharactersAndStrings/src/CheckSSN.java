package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class CheckSSN {
    /*  Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD, where D is a
        digit. Your program should check whether the input is valid.
        Sample run:
            Enter a SSN: 232-23-5435
            232-23-5435 is a valid social security number

            Enter a SSN: 23-23-5435
            23-23-5435 is an invalid social security number
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Social Security number : ");
        String ssn = input.next();

        if (ssn.charAt(3) == '-' && ssn.charAt(6) == '-') {
            if (ssn.length() == 11) {
                System.out.printf("%s is a valid social security number", ssn);
            } else {
                System.out.printf("%s is an invalid social security number", ssn);
            }
        } else {
            System.out.printf("%s is not a valid social security number", ssn);
        }

    }
}
