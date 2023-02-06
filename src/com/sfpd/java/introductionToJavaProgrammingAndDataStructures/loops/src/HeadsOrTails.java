package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

public class HeadsOrTails {
    //  Write a program that simulates flipping a coin two millions times and displays the number of heads or tails.
    public static void main(String[] args) {
        int flip = 0;
        int headsOrTails = 0;

        while (flip < 2000000) {
            if (Math.random() < 0.5) {
                headsOrTails = 1;
            } else {
                headsOrTails = 0;
            }
            flip++;
        }
        if (headsOrTails == 0){
            System.out.println("After flipping two millions times the result is heads");
        } else {
            System.out.println("After flipping two millions times the result is tails");
        }
    }
}
