package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Random;

public class RandomMonth {
    /* Write a program that randomly generates an integer between 1 and 12 and displays the English month names,
    January, February,...,December for the numbers 1,2,...,12, accordingly.
     */
    public static void main(String[] args) {
        // generate a random number between 1 and 12
        Random generator = new Random();
        int month = generator.nextInt(13);

        //display the name for the month
        System.out.println( month + " " + getMonthName(month));

    }
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "Mars"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "Juin"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }
        return monthName;
    }
}
