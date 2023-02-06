package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class HeadsOrTails {
    /* Write a program that lets the user guess whether the flip of a coin results in heads or tails.
    The program randomly generates an integer 0 or 1, which represents head or tail.
    The program prompts the user to enter a guess, and reports whether the guess is correct or incorrect.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int headsOrTails = 0;

        if (Math.random() < 0.5) {
            headsOrTails = 1;
        } else {
            headsOrTails = 0;
        }

        // Ask user for guess
        System.out.println("Enter your guess (1 = heads, 0 = tails): ");
        int guess = input.nextInt();

        // Report is the guess is correct or incorrect
        if (guess == headsOrTails) {
            System.out.println("You guest " + guess + ". YOU WON!");
        } else {
            System.out.println("You guest " + guess + ". YOU LOSE!");
        }
    }
}
