package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

public class ConversionFromInchToCm {
    /*  Write a program that displays the following table (note that 1 inch is 2.54 centimeters):
            Inches                  Centimeters
            1                       2.54
            2                       5.08
            ...
            9                       22.86
            10                      25.4
     */
    public static void main(String[] args) {
        double inches = 1.0;
        double centimeters = 0.0;
        System.out.println("Inches          Centimeters");
        while (inches <= 10){
            centimeters = inches * 2.54;
            System.out.println(Math.round(inches) + "               " + centimeters);
            ++inches;
            centimeters = inches * 2.54;
        }
    }
}
