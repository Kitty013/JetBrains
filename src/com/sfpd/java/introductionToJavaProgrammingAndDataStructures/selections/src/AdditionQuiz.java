package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        // generate number 1
        int number1 = (int) (System.currentTimeMillis() % 10);
        // generate number 2
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Ask for input from user
        System.out.println("Wat is " + number1 + " + " + number2 + "? ");

        // Receive Answer
        int answer = input.nextInt();

        // Display result
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}
