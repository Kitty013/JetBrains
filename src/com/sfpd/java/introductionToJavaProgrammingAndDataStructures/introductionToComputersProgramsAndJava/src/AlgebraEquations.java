package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.introductionToComputersProgramsAndJava.src;

public class AlgebraEquations {
    /** You can use Cramer's rule to solve the following 2 x 2 system of
     *  linear equation provided that ad - bc is not ():
     *      ax + by = e
     *      cx + dy = f
     *      x = (ed - bf) / (ad - bc)
     *      y = (af - ec) / (ad - bc)
     *  Write a program that solves the following equation and displays
     *  the falue for x and y
     *      3.4x + 50.2y = 44.5
     *      2.1x + .55y = 5.9
     */
    public static void main(String[] args) {
        double a = 3.4;
        double b = 50.2;
        double e = 44.5;
        double c = 2.1;
        double d = .55;
        double f = 5.9;
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        System.out.println(x);
        System.out.println(y);
    }
}
