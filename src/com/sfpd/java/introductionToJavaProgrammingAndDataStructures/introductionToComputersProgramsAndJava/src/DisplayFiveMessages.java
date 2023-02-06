package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.introductionToComputersProgramsAndJava.src;

public class DisplayFiveMessages {
    // Write a program that displays I Love Java five times.

    public static void main(String[] args) {

        // using a loop
        int count = 0;
        while (count < 5) {
            System.out.println("I love Java!");
            count++;
        }

        // Just using the printout line
        System.out.println("I love Java!");
        System.out.println("I love Java!");
        System.out.println("I love Java!");
        System.out.println("I love Java!");
        System.out.println("I love Java!");

        // Solution from the book
        System.out.println("I love Java");
        System.out.println("I love Java");
        System.out.println("I love Java");
        System.out.println("I love Java");
        System.out.println("I love Java");

    }
}
