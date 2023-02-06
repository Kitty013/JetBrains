package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.introductionToComputersProgramsAndJava.src;

public class SummationSeries {
    /** Write a program that displays the result of
     *      1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
     */
    public static int sumSerie(int i1, int i2) {
        int result = 0;
        for (int i = i1; i <= i2; i++)
            result += i;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum from 1 to 10 is " + sumSerie(1,10));

        // Solution from the book
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
    }
}
