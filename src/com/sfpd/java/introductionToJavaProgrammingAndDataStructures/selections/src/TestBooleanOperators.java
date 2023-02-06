package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Receive an input
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0)                         // and boolean operator
            System.out.println(number + " is divisible by 2 and 3.");
        if (number % 2 == 0 || number % 3 == 0)                         // or boolean operator
            System.out.println(number + " is divisible by 2 or 3.");
        if (number % 2 == 0 ^ number % 3 == 0)                          // exclusive or operator
            System.out.println(number + " is divisible by 2 or 3, but not both.");
    }
}
