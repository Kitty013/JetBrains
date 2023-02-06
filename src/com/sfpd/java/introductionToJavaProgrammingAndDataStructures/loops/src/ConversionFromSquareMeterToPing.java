package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

import java.text.DecimalFormat;

public class ConversionFromSquareMeterToPing {
    /*  Write a program that displays the following two tables side by side (note that 1 ping = 3.305 square meters):
            Ping        Square meter        |       Square meter        Ping
            10          33.050              |       30                  9.077
            15          49.575              |       35                  10.590
            ...
            75          247.875             |       95                  28.744
            80          264.400             |       100                 30.257
     */
    public static void main(String[] args) {
        double ping = 5;
        double squareMeter = 25;
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Ping        Square meter        |       Square meter        Ping");
        while (ping < 80 && squareMeter < 100){
            ping = ping + 5;
            double sqToM = ping * 3.305;
            squareMeter = squareMeter + 5;
            double pingToSqM = squareMeter / 3.305;
            System.out.println(Math.round(ping) + "        " + df.format(sqToM) + "        |       " + Math.round(squareMeter) + "     " + df.format(pingToSqM));
        }
    }
}
