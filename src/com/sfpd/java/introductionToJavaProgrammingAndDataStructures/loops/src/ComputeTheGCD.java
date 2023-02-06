package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

import java.util.Scanner;

public class ComputeTheGCD {
    /*  Another solution for GreatestCommonDivisor.java to find the greatest common divisor of two integers n1 and n2 is
        as follows: First find d to be the minimum of n1 and n2, then check whether d, d-1, d-2,...,2, or 1 is a divisor
        for both n1 and n2 in this order. The first such common divisor is the greatest common divisor for n1 and n2.
        Write a program that prompts the user to enter two positive integers and displays the gcd.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = input.nextInt();
        int d = Math.min(n1,n2);

        while (d > 0){
            if (n1 % d == 0 && n2 % d == 0) break;
            d--;
            }
        System.out.println("The greatest common divisor of " + n1 + " and " + n2 + " is " + d);
    }
}
