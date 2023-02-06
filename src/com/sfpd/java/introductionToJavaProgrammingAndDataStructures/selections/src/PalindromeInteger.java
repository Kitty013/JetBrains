package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class PalindromeInteger {
    /* Write a program that prompts the user to enter a three-digit integer and determinate whether it is a
    palindrome integer. An integer is palindrome if it reads the same from the right to left and left to right.
    A negative integer is treated the same as a positive integer.
    Sample run: 121 ==> 121 is a palindrome.
    Sample run: 123 ==> 123 is not a palindrome.
     */
    public static void main(String[] args) {
        // Ask the user for input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an 3-digit number: ");
        int inputUser = input.nextInt();
        int size = String.valueOf(inputUser).length();
        // Determine valid input
        if (size != 3) {
            System.out.println("Your input is invalid! Please try again");
        }
        // Define input into separate digits
        int n1 = inputUser / 100 % 10;
        int n2 = inputUser / 10 % 10;
        int n3 = inputUser % 10;
        // check if input is a palindrome
        if(n1 == n3) {
            System.out.println("The number " + inputUser + " is a palindrome.");
        } else {
            System.out.println("The number " + inputUser + " is not a palindrome.");
        }
    }
}
