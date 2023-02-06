package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Random;
import java.util.Scanner;

public class ScissorRockPaper {
    /* Write a program that plays the popular scissor-rock-paper game. The program randomly generates a number 0, 1,
    or 2 representing scissor, rock, paper. The program prompts the user to enter a number 0, 1, or 2 and displays a
    message indicating whether the user or the computer wins, loses, or draws.
    Sample run: 1 ==> The computer is scissor. You are rock. YOU WON!
    Sample run: 2 ==> The computer is paper. You are paper too. ITS A DRAW!
     */
    public static void main(String[] args) {
        // Ask input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice (0 for paper , 1 for scissor or 2 for rock): ");
        int yourChoice = input.nextInt();

        if(yourChoice >= 3) {
            System.out.println("Sorry, you can't chose this number. Please pick 0 for paper, 1 for scissor or 2 for rock");
        } else {
            System.out.println("You chose " + displayName(yourChoice));
        }

        // Generate random choice
        Random generateChoice = new Random();
        int computersChoice = generateChoice.nextInt(3);
        System.out.println("The computer chose " + displayName(computersChoice));


        // Play scissor rock paper
        if (computersChoice == yourChoice) {
            System.out.println("It's a tie! Try again!");
        } else {
            if ((computersChoice == 0 && yourChoice == 1) || (computersChoice == 1 && yourChoice == 2) || (computersChoice == 2 && yourChoice == 0)) {
                System.out.println("You win!");
            } else {
                if ((computersChoice == 0 && yourChoice == 2) || (computersChoice == 2 && yourChoice == 1) || (computersChoice == 1 && yourChoice == 0)) {
                    System.out.println("The computer wins!");
                }
            }
        }
    }

    private static String displayName(int computersChoice) {
        if(computersChoice == 0) {
            return "paper";
        } else {
            if (computersChoice == 1) {
                return "scissor";
            }
            return "rock";
        }
    }
}