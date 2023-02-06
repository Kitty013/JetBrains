package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class MultiplicationQuiz {
    /* SubtractionQuiz.java randomly generates a subtraction question. Revise the program to randomly generate a
    multiplication question with two integers less than 1000.
     */
    public static void main(String[] args) {
        // Generate two random single-digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // Ask the user to answer te question
        System.out.println("What is " + number1 + " * " + number2 + "?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();   // get answer

        // Grade the answer and display the result
        if (number1 * number2 == answer)        // check the answer
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " * " + number2 + " should be " + (number1 * number2));
        }
    }
}
