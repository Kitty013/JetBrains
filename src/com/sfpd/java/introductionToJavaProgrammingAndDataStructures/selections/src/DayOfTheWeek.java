package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class DayOfTheWeek {
    /* Zeller's congruence is an algorithm developed by Christian Zeller to calculate the day of the week.
    The formula is
    h = (q + (26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7
    where
        - h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, and 6: Friday).
        - q is the day of the month.
        - m is the month (3: March, 4: April,...,12: December). January and February are counted as months 13 and 14 of
          the previous year.
        - j is (year / 100).
        - k is the year of the century (i.e.year%100)
    Note that all divisions in this exercise perform an integer division. Write a program that prompts the user to
    enter a year, month, and day of the month, and displays the name of the day of the week.
    Hint: January and February are counted as 13 and 14 in the formula, so you need to convert the user input 1 to 13
          and 2 to 14 for the month and change the year to the previous year. For example, if the user enters 1 for m
          and 2015 for year, m will be 13 and year will be 2014 used in the formula.)
    Sample Run: 2015 - 1 - 25 ==> Day of the week is Sunday
    Sample Run: 2012 - 5 - 12 ==> Day of the week is Saturday.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year in numbers: ");
        int year = input.nextInt();
        System.out.println("Enter the month in numbers: ");
        int month = input.nextInt();
        System.out.println("Enter the day in numbers: ");
        int day = input.nextInt();

        int j = year / 100;
        int k = year % 100;
        int m = month;
        int q = day;

        if (month == 1) {
            m = month + 12;
        } else if (month == 2) {
            m = month + 12;
        } else {
            m = month;
        }

        int h = (q + (26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j);

        switch (h % 7) {
            case 0: System.out.println("Day of the week is Saturday"); break;
            case 1: System.out.println("Day of the week is Sunday"); break;
            case 2: System.out.println("Day of the week is Monday"); break;
            case 3: System.out.println("Day of the week is Tuesday"); break;
            case 4: System.out.println("Day of the week is Wednesday"); break;
            case 5: System.out.println("Day of the week is Thursday"); break;
            case 6: System.out.println("Day of the week is Friday"); break;
            case 7: System.out.println("Day of the week is Saturday"); break;
            case 8: System.out.println("Day of the week is Sunday"); break;
            case 9: System.out.println("Day of the week is Monday"); break;
        }
    }
}

