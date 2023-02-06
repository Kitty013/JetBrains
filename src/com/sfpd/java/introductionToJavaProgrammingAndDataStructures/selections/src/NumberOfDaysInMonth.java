package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class NumberOfDaysInMonth {
    /* Write a program that prompts the user to enter the month and year and displays the number of days in the month.
    Example: if the user inputs 2 and 2012, the program should display that February 2012 has 29 days.
    Example: if the user inputs 3 and 2015, the program should display that March 2015 has 31 days.
     */
    public static void main(String[] args) {
        // Ask for input month
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month in numbers (1 - january ; 2 - february ; 3 - mars; 4 - april ; ...): ");
        int month = input.nextInt();
        // Ask for input year
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        // create boolean to see if year is leap year.
        boolean leapYear = (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0));

        // create month number list
        if (month == 1) {
            System.out.println("January " + year + " has 31 days");
        } else { if(leapYear = true && month == 2) {
            System.out.println("February " + year + " has 29 days");
        } else { if(leapYear = false && month == 2) {
            System.out.println("February " + year + " has 28 days");
        } else { if(month == 3) {
            System.out.println("Mars " + year + " has 31 days");
        } else {if (month == 4) {
            System.out.println("April " + year + " has 30 days");
        } else {if (month == 5) {
            System.out.println("May " + year + " has 31 days");
        } else {if (month == 6) {
            System.out.println("Juin " + year + " has 30 days");
        } else {if (month == 7) {
            System.out.println("July " + year + " has 31 days");
        } else {if (month == 8) {
            System.out.println("August " + year + " has 31 days");
        } else {if (month == 9) {
            System.out.println("September " + year + " has 30 days");
        } else {if (month == 10) {
            System.out.println("Oktober " + year + " has 31 days");
        } else {if (month == 11) {
            System.out.println("November " + year + " has 30 days");
        } else {if (month == 12) {
            System.out.println("December " + year + " has 31 days");
        }
        }
        }
        }
        }
        }
        }
        }
        }
        }
        }
        }
        }
    }
}