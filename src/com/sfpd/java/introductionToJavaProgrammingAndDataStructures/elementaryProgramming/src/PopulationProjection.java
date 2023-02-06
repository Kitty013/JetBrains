package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.elementaryProgramming.src;

import java.util.Scanner;

public class PopulationProjection {
    /** Rewrite PopulationProjection Chapter 1 Prog Ex
     *  Prompt the user to enter the number of years
     *  Display the population after the number of years.
     */
     public static void main(String[] args) {
        long currentPopulation = 312032486;
        long secondsAYear = (86400 * 365);
        double birthsAYear = (secondsAYear/7);
        double deathAYear = (secondsAYear/13);
        double immigrantsAYear = (secondsAYear/45);
        double populationAYear = (birthsAYear - deathAYear + immigrantsAYear);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        long numberOfYears = input.nextLong();
        double newPopulation = currentPopulation + (populationAYear * numberOfYears);

        System.out.println("The population after " + numberOfYears + " years is " + newPopulation);
    }
}
