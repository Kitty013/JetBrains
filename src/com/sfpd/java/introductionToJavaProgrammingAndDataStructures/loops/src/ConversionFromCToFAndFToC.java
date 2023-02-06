package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

import java.text.DecimalFormat;

public class ConversionFromCToFAndFToC {
    /*  Write a program that displays the following two tables side by side:
        (Note that fahrenheit = celsius * 9/5 + 32):
            Celsius     Fahrenheit      |       Fahrenheit     Celsius
            0           32.000          |        20            -6.667
            2           35.600          |        25            -3.889
            ...
            98          208.400         |       265            129.444
           100          212.000         |       270            132.222
     */
    public static void main(String[] args) {
        double celToFah = -2;
        double fahTocel = 15;
        DecimalFormat df = new DecimalFormat("#.000");

        System.out.println("Celcius     Fahrenheit      |       Fahrenheit      Celsius");
        while (celToFah < 100 && fahTocel < 270){
            celToFah = celToFah + 2;
            double fahrenheit = celToFah * 9/5 + 32;
            fahTocel = fahTocel + 5;
            double celsius =  (fahTocel - 32) * 5/9;
            System.out.println("    " + Math.round(celToFah) + "           " + df.format(fahrenheit) + "        |       " + Math.round(fahTocel) + "               " + df.format(celsius));
        }
    }
}
