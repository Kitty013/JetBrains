package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class ConvertLetterGradeToNumber {
    /*  Write a program that prompts the user to enter a letter grade A,B,C,D, or F and displays its corresponding
        numeric value 4, 3, 2, 1, and 0. For other input, display invalid grade
        Sample run:
            Enter a letter grade: B
            The numeric value for grade B is 3.

            Enter a letter grade: T
            T is an invalid grade
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter grade (A - B - C - D - F)");
        String letterGrade = input.next().toUpperCase();

            if (letterGrade.equals("A")) {
                System.out.println("The numeric value for grade " + letterGrade + " is 4");
            } else if (letterGrade.equals("B")) {
                System.out.println("The numeric value for grade " + letterGrade + " is 3");
            }
            else if (letterGrade.equals("C")) {
                System.out.println("The numeric value for grade " + letterGrade + " is 2");
            }
            else if (letterGrade.equals("D")) {
                System.out.println("The numeric value for grade " + letterGrade + " is 1");
            }
            else if (letterGrade.equals("F")) {
                System.out.println("The numeric value for grade " + letterGrade + " is 0");
            }
            else {
                System.out.println(letterGrade + " is an invalid grade.");
            }
        }
    }


