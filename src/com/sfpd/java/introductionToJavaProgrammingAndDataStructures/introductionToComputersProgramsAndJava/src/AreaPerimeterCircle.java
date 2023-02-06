package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.introductionToComputersProgramsAndJava.src;

public class AreaPerimeterCircle {
    // Write a program that displays the area and perimeter of a circle that has a radius
    // of 6.5 using the following formula:
    // Pi = 3.14159
    // Perimeter = 2 x radius x Pi
    // Area = radius x radus x Pi

    public static void main(String[] args) {
        final double pi = 3.14159;
        double radiusCircle = 6.5;
        double areaCircle = (2 * radiusCircle * pi);
        double perimeterCircle = (radiusCircle * radiusCircle * pi);

        System.out.println("The perimeter of the circle is " + areaCircle);
        System.out.println("The area of the circle is " + perimeterCircle);

        // Solution from the book
        // Display area
        System.out.println(6.5 * 6.5 * 3.14159);

        // Display perimeter
        System.out.println(2 * 6.5 * 3.14159);
    }
}
