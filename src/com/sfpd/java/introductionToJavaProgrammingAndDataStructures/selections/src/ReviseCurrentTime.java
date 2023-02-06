package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

public class ReviseCurrentTime {
    /* Revise program CurrentTime to display the hour using a 12-hour clock.
    Sample run: -5 ==> The current time is 4:50:34 PM
     */
    public static void main(String[] args) {
    // Compute the current second, minute and hour

    // Obtain the total milliseconds since midnight, Jan 1, 1970
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
    long currentHour = totalHours % 12;

    // Displays results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
}
}
