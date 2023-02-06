package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Random;

public class GenerateVehiclePlatNumbers {
    /*  Assume that a vehicle plate number consists of three uppercase letters followed by four digits.
        Write a program to generate a plate-number.
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        char c1 = (char) ('A'+ rnd.nextInt(26));
        char c2 = (char) ('A'+ rnd.nextInt(26));
        char c3 = (char) ('A'+ rnd.nextInt(26));
        int numbers = (int)(Math.random() * 10000);
        System.out.println("The vehicle plate number is " + c1 + c2 + c3 + numbers);
    }
}
