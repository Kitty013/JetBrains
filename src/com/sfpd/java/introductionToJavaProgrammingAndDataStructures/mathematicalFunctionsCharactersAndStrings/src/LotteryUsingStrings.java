package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class LotteryUsingStrings {
    /*  This program gives a new program that generates a random two-digit string instead of a number, and receives the
        input as a string instead of a number.
     */
    public static void main(String[] args) {
        // Generate a lottery as a two-digit string
        String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();

        // Get digits from lottery
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        // Get digits from guess
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(0);

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess.equals(lottery))
            System.out.println("Exact match: you win $ 10.000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $ 3.000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 ||
                 guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $ 1.000");
        else
            System.out.println("Sorry, no match");
    }
}
