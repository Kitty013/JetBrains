package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class GuessBirthday {
    /*  This is a program that prompts the user to answer five questions. Each question asks whether the day is in one
        of the five number sets. The birthday is the sum of the first numbers in the sets where the day appears. Prompt
        the user to answer whether the day is in Set1, in Set2, in Set3, in Set4, or in Set5. If the number is in the
        set, the program adds the first number in the set to day.
     */
    public static void main(String[] args) {
        String set1 = "  1  3  5  7\n" +
                      "  9 11 13 15\n" +
                      " 17 19 21 23\n" +
                      " 25 27 29 31";
        String set2 = "  2  3  6  7\n" +
                      " 10 11 14 15\n" +
                      " 18 19 22 23\n" +
                      " 26 27 30 31";
        String set3 = "  4  5  6  7\n" +
                      " 12 13 14 15\n" +
                      " 20 21 22 23\n" +
                      " 28 29 30 31";
        String set4 = "  8  9 10 11\n" +
                      " 12 13 14 15\n" +
                      " 24 25 26 27\n" +
                      " 28 29 30 31";
        String set5 = " 16 17 18 19\n" +
                      " 20 21 22 23\n" +
                      " 24 25 26 27\n" +
                      " 28 29 30 31";

        // day to be determined
        int day = 0;

        // create scanner
        Scanner input = new Scanner(System.in);

        // prompt the user to answer questions
        System.out.println("Is your birthday in Set1?\n");
        System.out.println(set1);
        System.out.println("\nEnter 0 for No and 1 for Yes: ");
        int answer = input.nextInt();

        // in Set1?
        if (answer == 1)
            day += 1;

        // prompt the user to answer questions
        System.out.println("Is your birthday in Set2?\n");
        System.out.println(set2);
        System.out.println("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        // in set2?
        if (answer == 1)
            day += 2;

        // prompt the user to answer questions
        System.out.println("Is your birthday in Set3?\n");
        System.out.println(set3);
        System.out.println("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        // in set3?
        if(answer == 1)
            day += 4;

        // prompt the user to answer questions
        System.out.println("Is your birthday in Set4?\n");
        System.out.println(set4);
        System.out.println("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        // in set4?
        if(answer == 1)
            day += 8;

        // prompt the user to answer questions
        System.out.println("Is your birthday in Set5?\n");
        System.out.println(set5);
        System.out.println("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        // in set5?
        if(answer == 1)
            day += 16;

        System.out.println("\nYour birthday is " + day + " !");
    }
}
