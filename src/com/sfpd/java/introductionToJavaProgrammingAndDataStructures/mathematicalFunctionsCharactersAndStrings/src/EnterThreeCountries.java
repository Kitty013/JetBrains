package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class EnterThreeCountries {
    /*  Write a program that prompts the user to enter three countries and displays them in descending order.
        Sample run:
            Enter the first country: Germany
            Enter the second country: France
            Enter the third country: Switzerland
            The three countries in descending order are Switzerland Germany France
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first country: ");
        String firstCountry = input.nextLine();
        System.out.println("Enter the second country:");
        String secondCountry = input.nextLine();
        System.out.println("Enter the third country:");
        String thirdCountry = input.nextLine();
        char c1 = firstCountry.charAt(0);
        char c2 = secondCountry.charAt(0);
        char c3 = thirdCountry.charAt(0);

        System.out.println("The three countries in descending order are: ");

        if(c1 > c2 && c1 > c3 && c2 > c3){
            System.out.println(firstCountry + " " + secondCountry + " " + thirdCountry);
        } else if(c1 > c2 && c1 > c3 && c3 > c2) {
            System.out.println(firstCountry + " " + thirdCountry + " " + secondCountry);
        } else if (c2 > c3 && c2 > c1 && c3 > c1) {
            System.out.println(secondCountry + " " + thirdCountry + " " + firstCountry);
        } else if (c2 > c3 && c2 > c3 && c1 > c3){
            System.out.println(secondCountry + " " + firstCountry + " " + thirdCountry);
        } else if (c3 > c2 && c3 > c1 && c2 > c1){
            System.out.println(thirdCountry + " " + secondCountry + " " + firstCountry);
        } else {
            System.out.println(thirdCountry + " " + firstCountry + " " + secondCountry);
        }
    }
}
