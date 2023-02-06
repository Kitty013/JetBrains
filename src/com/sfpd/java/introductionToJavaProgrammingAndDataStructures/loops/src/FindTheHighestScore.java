package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

import java.util.Scanner;

public class FindTheHighestScore {
    /*  Write a program that prompts the user to enter the number of students and each student's name and score, and
        finally displays the name of the student with the highest score. Use the next() method in the Scanner class to
        read a name, rather than using the nextLine() method.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int NUMBER_OF_STUDENTS = input.nextInt();
        int count = 0;
        int highestScore = 0;
        String primusName = "";
        String name = "";
        int score = 0;
        while (count < NUMBER_OF_STUDENTS) {
            System.out.println("Enter the students name and score: ");
            name = input.next();
            score = input.nextInt();
            count++;

            if (score > highestScore){
                highestScore = score;
                primusName = name;
            } else {
                highestScore = highestScore;
                primusName = primusName;
            }
        }
        System.out.println("The student with the highest score is " + highestScore + " " + primusName);
    }
}
