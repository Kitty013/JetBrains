package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Random;
import java.util.Scanner;

public class MultiplyThreeNumbers {
    /* The program AdditionQuiz generates two integers and prompts the user to enter the product of these two integers.
    Revise the program to generate three single-digit integers and prompt the user to enter the multiplication of these
    three integers.
     */
    public static void main(String[] args) {
        // generate number 1
        int number1 = (int) (System.currentTimeMillis() % 10);
        // generate number 2
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);
        // generate number 3
        Random number = new Random();
        int number3 = number.nextInt(10);
        // Calculate Answer
        int correctAnswer = number1 * number2 * number3;

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Ask for input from user
        System.out.println("Wat is " + number1 + " * " + number2 + " * " + number3 + " ?");

        // Process the input from the user
        int answer = input.nextInt();
        if (answer == correctAnswer){
            System.out.println("Congrats, you are correct! " + number1 + " * " + number2 + " * " + number3 + " = " + correctAnswer);
        } else {
            // Display result
            System.out.println("The correct result is " + correctAnswer);
        }
    }
}
