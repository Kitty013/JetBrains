package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    /*  gives a program that prompts the user to enter an answer for a question on addition of two single digits. Using
        a loop, you can now rewrite the program to let the user repeatedly enter a new answer until it is correct.
     */
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        // Create a scanner
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + " ?");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }
}

