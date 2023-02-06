package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.elementaryProgramming.src;

import java.util.Scanner;

public class CurrentTime {
    /** ShowCurrentTime gives a program that displays the current time in GMT.
     *  Revise the program so it prompts the user to enter the time zone offset to GMT
     *  Display the time in the specified timezone
     *  -5 => 4:50:34
     */
     public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        // Ask for input from user
        System.out.println("Enter the time zone GMT: ");
        long timeZone = input.nextLong();

        // Compute the current second, minute and hour
        // Obtain the total milliseconds in the timezone
        long totalMilliSeconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliSeconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Displays results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

        // Calculate the time in the selected timezone
        long currentTimeZone = currentHour + timeZone;

        // Display result
        System.out.println("The current time in time zone " + timeZone + " is " + currentTimeZone + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
