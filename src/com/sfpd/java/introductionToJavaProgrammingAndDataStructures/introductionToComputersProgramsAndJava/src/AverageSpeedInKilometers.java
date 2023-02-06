package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.introductionToComputersProgramsAndJava.src;

public class AverageSpeedInKilometers {
    // Assume that a runner runs 24 miles in 1 hour, 40 minutes and 35 seconds
    // Write a program that displays the average speed in kilometers per hour
    // Note 1 mile is equal to 1.6 kilometers

    public static void main(String[] args) {
        double miles = 24;
        double kilometers = miles * 1.6 ;
        double hoursRun = 1;
        double minutesRun = 40;
        double secondsRun = 35;
        double totalHoursRun = hoursRun + (minutesRun/60) + (secondsRun/3600);
        double kmPerHour = kilometers / totalHoursRun;

        System.out.println(kmPerHour);

        // Solution from the book
        System.out.println(24 / (1 + (40 + 35.0 / 60) / 60) * 1.6);
    }
}
