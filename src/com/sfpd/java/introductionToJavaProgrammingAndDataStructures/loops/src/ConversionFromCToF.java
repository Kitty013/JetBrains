package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

public class ConversionFromCToF {
    //  Write a program that displays the following table (note that fahrenheit = celsius * 9/5 + 32):
    public static void main(String[] args) {
        double celsius = 0.0;
        double fahrenheit = celsius * 9/5 + 32;

        System.out.println("Celcius     Fahrenheit");
        while (celsius <= 100){
            System.out.println(Math.round(celsius) + "           " + fahrenheit);
            celsius = celsius + 2;
            fahrenheit = celsius * 9/5 + 32;
        }
    }
}
