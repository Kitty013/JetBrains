package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

import java.util.Scanner;

public class FindTheFactorsOfAnInteger {
    /*  Write a program that reads an integer and displays all its smallest factors in an increasing order. For example,
        if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5;
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int prime = 2;
        int sqrNumber = (int) Math.sqrt(n);

        while (prime <= sqrNumber) {
            if (n % prime == 0) {
                System.out.print(prime + " ");
                n /= prime;
            } else {
                prime++;
            }
        }
    }
}
