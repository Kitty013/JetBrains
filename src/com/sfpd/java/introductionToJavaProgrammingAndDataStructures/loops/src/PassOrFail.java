package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

import java.util.Scanner;

public class PassOrFail {
    /*  Write a program that prompts a student to enter a Java score. If the score is greater or equal to 60, display
        "you pass the exam"; otherwise, display "you don't pass the exam". Your program ends with input -1.
        Sample Run:
            Enter your score: 80
            You pass the exam.

            Enter your score: 59
            You don't pass the exam.

            Enter your score: -1
            No numbers are entered except 0.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = input.nextInt();
        String result = " ";

        while(result == " "){
            if (score >= 60){
              result = "you pass the exam.";
          } else if (score < 60 && score > 0) {
              result = "you don't pass the exam.";
          } else if (score < 0){
              result = "no numbers are entered except 0.";
          }
        }
        System.out.println(result);
    }
}
