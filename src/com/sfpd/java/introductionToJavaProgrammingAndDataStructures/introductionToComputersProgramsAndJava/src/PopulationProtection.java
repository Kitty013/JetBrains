package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.introductionToComputersProgramsAndJava.src;

public class PopulationProtection {
    /** The US Census Bureau projects population based on the following
     *  assumptions:
     *      one birth every 7 seconds
     *      one death every 13 seconds
     *      one new immigrant every 45 seconds
     *  Write a program that displays the population for each of the next
     *  five years. Assume that the current population is 312 032 486 and
     *  one year has 365 days.
    */
    public static void main(String[] args) {
        long currentPopulation = 312032486;
        long secondsAYear = (86400 * 365);
        double birthsAYear = (secondsAYear/7);
        double deathAYear = (secondsAYear/13);
        double immigrantsAYear = (secondsAYear/45);
        double populationAYear = (birthsAYear - deathAYear + immigrantsAYear);
        double newPopulation = currentPopulation + populationAYear;
        int i = 1;

        while (i < 6) {
            System.out.println(newPopulation = newPopulation + populationAYear);
            i++;
        }

        System.out.println("The population after five years is " + newPopulation);
    }
}
