package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

public class FutureTuition {
    /*  Suppose the tuition for a university is $10.000 this year and tuition increases 7% every year. In how many years
        will the tuition be doubled? Write a program to solve this problem.
     */
    public static void main(String[] args) {
        double tuition = 10000;         // Year 0
        int year = 0;
        while (tuition < 20000) {
            tuition = tuition * 1.07;
            year++;
        }
        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
    }
}
