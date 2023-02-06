package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

import java.util.Scanner;

public class FindTheTwoLowestScores {
    /*  Write a program that prompts the user to enter the number of students and each student's name and score, and
        finally displays the names of the students with the lowest and second-lowest scores.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int NUMBER_OF_STUDENTS = input.nextInt();
        int count = 0;
        int lowestScore = 10;
        int secondLowestScore = 10;
        String nameLowestScore = "";
        String nameSecondLowestScore = "";

        while (count < NUMBER_OF_STUDENTS) {
            System.out.println("Enter the student's name and score: ");
            String name = input.next();
            int score = input.nextInt();
            count++;

            if (score < lowestScore) {
                lowestScore = score;
                nameLowestScore = name;
            } else if (score > lowestScore && score < secondLowestScore) {
                secondLowestScore = score;
                nameSecondLowestScore = name;
            } else if (score > lowestScore && score > secondLowestScore) {
                lowestScore = lowestScore;
                secondLowestScore = secondLowestScore;
                nameLowestScore = nameLowestScore;
                nameSecondLowestScore = nameSecondLowestScore;
            }
        }
        System.out.println("The student with the lowest score is " + nameLowestScore + " " + lowestScore);
        System.out.println("The student with the second lowest score is " + nameSecondLowestScore + " " + secondLowestScore);
    }
}
