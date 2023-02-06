package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class CurrencyExchange {
    /* Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB.
    Prompt the user to enter 0 to convert from US dollars to Chinese RMB and 1 to convert from Chinese RMB to US dollars.
    Prompt the user to enter the amount in US dollars or Chinese RMB to convert it to Chinese RMB or US dollars.
    Sample run: 6.81 - 0 - 100 ==> $100.0 is 681.0 yuan
    Sample run: 6.81 - 1 - 10000 ==> 10000.0 yuan is $1468.43
    Sample run: 6.81 - 5 ==> incorrect input
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 0 to convert from US dollars to Chinese RMB or Press 1 to convert from Chinese RMB" +
                " to US dollars: ");
        int chose = input.nextInt();
        // constant
        final double conversion = 6.81;

        if (chose == 0) {
            System.out.println("Enter the amount of US Dollars: ");
            double amountUS = input.nextDouble();
            double resultRMB = amountUS * conversion;
            System.out.println("$" + amountUS + " is " + resultRMB + " yuan");
        }
        if (chose == 1) {
            System.out.println("Enter the amount of Chinese RMB: ");
            double amountRMB = input.nextDouble();
            double resultUS = amountRMB / conversion;
            System.out.println(amountRMB + " yuan is $" + resultUS);
        }

    }
}
