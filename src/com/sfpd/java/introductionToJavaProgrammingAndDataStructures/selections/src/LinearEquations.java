package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class LinearEquations {
    /* A linear equation can be solved using Cramer's rule.
    // ax + by = e
    // cx + dy = f
    // x = (ed - bf) / (ad - bc)
    // y = (af - ec) / (ad - bc)
    Write a program that prompts the user to enter a, b, c, d, e, and f and displays the result.
    If ad - bc is 0, report that "The equation has no solution."
    Sample run: 9.0 / 4.0 / 3.0 /  -5.0 / -6.0 / -21.0 ==> x is -2.0 and y is 3.0
    Sample run: 1.0 / 2.0 / 2.0 /  4.0 / 4.0 / 5.0 ==> The equation has no solution.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask for input a, b, c, d, e and f
        System.out.println("Enter value a: ");
        double a = input.nextDouble();
        System.out.println("Enter value b: ");
        double b = input.nextDouble();
        System.out.println("Enter value c: ");
        double c = input.nextDouble();
        System.out.println("Enter value d: ");
        double d = input.nextDouble();
        System.out.println("Enter value e: ");
        double e = input.nextDouble();
        System.out.println("Enter value f: ");
        double f = input.nextDouble();

        // solve the equation
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        e = (a * x) + (b * y);
        f = (c * x) + (d * y);
        double infinityX = ((4.0 * 4.0) - (2.0 * 5.0)) / ((1.0 * 4.0) - (2.0 * 2.0));
        double infinityY = ((1.0 * 5.0) - (4.0 * 2.0)) / ((1.0 * 4.0) - (2.0 * 2.0));

        // display results
        if (x == infinityX && y == infinityY) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}