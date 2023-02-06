package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class FindFutureDates {
    /* Write a program that prompts the user to enter an integer for today's day of the week (Sunday is 0, Monday is 1,...,
    and Saterday is 6). Also prompt the user to enter the number of days after today for a future day and display the
    future day of the week.
    Sample run: 1 - 3 ==> Today is monday and the future day is Thursday
    Sample run: 0 - 31 ==> Today is sunday and the future day is Wednesday
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Enter an integer for the day of the week (Sunday = 0, Monday = 1,...): ");
        int dayOfWeek = input.nextInt();
        System.out.println("Enter the number of days after today: ");
        int numberOfDays = input.nextInt();

        // display the futureDay
        switch (dayOfWeek + (numberOfDays % 7)) {
            case 0: System.out.println("Day of the week is Sunday"); break;
            case 1: System.out.println("Day of the week is Monday"); break;
            case 2: System.out.println("Day of the week is Tuesday"); break;
            case 3: System.out.println("Day of the week is Wednesday"); break;
            case 4: System.out.println("Day of the week is Thursday"); break;
            case 5: System.out.println("Day of the week is Friday"); break;
            case 6: System.out.println("Day of the week is Saturday"); break;
            default:
                System.out.println("Invalid input");break;
        }
    }
}
