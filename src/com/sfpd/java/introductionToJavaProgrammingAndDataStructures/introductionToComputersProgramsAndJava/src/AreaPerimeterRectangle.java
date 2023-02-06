package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.introductionToComputersProgramsAndJava.src;

public class AreaPerimeterRectangle {
    // Write a program that displays the area and perimeter of a rectangle
    // with a width of 5.3 and height of 8.6 using the following formula:
    // area = width x height
    // perimeter = 2 x (width + height)

    public static void main(String[] args) {
        double widthRectangle = 5.3;
        double heightRectangle = 8.6;
        double areaRectangle = widthRectangle * heightRectangle;
        double perimeterRectangle = 2 * (widthRectangle + heightRectangle);

        System.out.println("The area of the rectangle is " + areaRectangle);
        System.out.println("The perimeter of the rectangel is " + perimeterRectangle);
    }
}
