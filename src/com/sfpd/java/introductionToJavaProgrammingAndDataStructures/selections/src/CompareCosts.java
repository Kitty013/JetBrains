package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class CompareCosts {
    /* Suppose you shop for rice in two different packages. You would like to write a program to compare the cost.
    The program prompts the user to enter the weight and price of each package and displays the one with the better
    price.
    Sample run: 50 24.59 - 25 11.99 ==> Package 2 has a better price.
    Sample run: 50 25 - 25 12.5 ==> Two packages have the same price.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ask user for weight of the package 1
        System.out.println("How much grams is the weight of package 1? ");
        double weightPackage1 = input.nextDouble();
        // Ask user for price of the package 1
        System.out.println("How much is the price of package 1? ");
        double pricePackage1 = input.nextDouble();
        // Ask user for weight of package 2
        System.out.println("How much grams is the weight of package 2? ");
        double weightPackage2 = input.nextDouble();
        // Ask user for price of package 2
        System.out.println("How much is the price of package 2? ");
        double pricePackage2 = input.nextDouble();
        // grams to kilos
        double weightPackage1inKilos = weightPackage1 * 1000;
        double weightPackage2inKilos = weightPackage2 * 1000;
        // price per kilo
        double pricePackage1PerKilo = weightPackage1inKilos / pricePackage1;
        double pricePackage2PerKilo = weightPackage2inKilos / pricePackage2;
        // compare prices
        if (pricePackage1PerKilo > pricePackage2PerKilo) {
            System.out.println("Package 1 WON");
        } if (pricePackage1PerKilo < pricePackage2PerKilo) {
            System.out.println("Package 2 WON");
        } else {
            System.out.println("The price is equal.");
        }
    }
}
