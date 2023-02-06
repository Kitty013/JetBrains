package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class OrderTwoCities {
    //  This is a program that prompts the user to enter two cities and displays them in alphabetical order.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two cities
        System.out.println("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.println("Enter the second city: ");
        String city2 = input.nextLine();

        // Compare the two cities
        if(city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
        else
            System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
    }
}
