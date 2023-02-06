package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class SortThreeIntegers {
    // Write a program that prompts the user to enter three integers and displays the integers in non-decreasing order.
    public static void main(String[] args) {
        // Ask the user to input three integers
        Scanner input = new Scanner(System.in);
        // input number 1
        System.out.println("Please enter your first number: ");
        int number1 = input.nextInt();
        // input number 2
        System.out.println("Please enter your second number: ");
        int number2 = input.nextInt();
        // input number 3
        System.out.println("Please enter your third number: ");
        int number3 = input.nextInt();

        // Display the integers in non-decreasing order
        if ((number1 > number2 && number1 > number3) && number2 > number3) {
            System.out.println(number3);
            System.out.println(number2);
            System.out.println(number1);
        } else {
            if ((number1 > number2 && number1 > number3) && number3 > number2) {
                System.out.println(number2);
                System.out.println(number3);
                System.out.println(number1);
            } else {
                if ((number2 > number3 && number2 > number1) && number3 > number1) {
                    System.out.println(number1);
                    System.out.println(number3);
                    System.out.println(number2);
                } else {
                    if ((number2 > number3 && number2 > number1) && number1 > number3) {
                        System.out.println(number3);
                        System.out.println(number1);
                        System.out.println(number2);
                    } else {
                        if ((number3 > number1 && number3 > number2) && number1 > number2) {
                            System.out.println(number2);
                            System.out.println(number1);
                            System.out.println(number3);
                        } else {
                            if ((number3 > number1 && number3 > number2) && number2 > number1) {
                                System.out.println(number1);
                                System.out.println(number2);
                                System.out.println(number3);
                            }
                        }
                    }
                }
            }
        }
    }
}