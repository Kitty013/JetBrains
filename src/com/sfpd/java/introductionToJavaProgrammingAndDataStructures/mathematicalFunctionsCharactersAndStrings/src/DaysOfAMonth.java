package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class DaysOfAMonth {
    /*  Write a program that prompts the user to enter the year and the first three letters of a month name (with the
        first letter in uppercase) and displays the number of days in the month. If the input for month is incorrect,
        display a message.
        Sample run:
            Enter a year: 2001
            Enter a month: Jan
            Jan 2001 has 31 days

            Enter a year: 2016
            Enter a month: jan
            jan is not a correct month name
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        System.out.println("Enter the month name (with the first letter in uppercase): ");
        String month = input.next();

        if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Okt") || month.equals("Dec")) {
            System.out.println(month + " " + year + " has 31 days");
        }
        else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
            System.out.println(month + " " + year + " has 30 days");
        }
        else if (month.equals("Feb")){
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(month + " " + year + " has 29 days");
            }
            else if (year % 4 != 0) {
                System.out.println(month + " " + year + " has 28 days");
            }
            else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                System.out.println(month + " " + year + " has 29 days");
            }
            else {
                System.out.println(month + " " + year + " has 28 days");
            }
        }
        else {
            System.out.println(month + " is not a correct month name");
        }
    }
}
