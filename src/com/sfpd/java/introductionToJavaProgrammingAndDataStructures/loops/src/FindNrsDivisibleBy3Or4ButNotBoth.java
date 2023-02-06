package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

public class FindNrsDivisibleBy3Or4ButNotBoth {
    /*  Write a program that displays all the numbers from 100 to 200, ten per line, that are divisible by 3 or 4, but
        not both. Numbers are separated by exactly one space.
     */
    public static void main(String[] args) {
        int count = 0;
        final int NUMBERS_PER_LINE = 10;
        int i = 100;
        while (i <= 1000) {
            i++;
            if (i % 3 == 0 ^ i % 4 == 0) {
                count++;
                if (count % NUMBERS_PER_LINE == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
