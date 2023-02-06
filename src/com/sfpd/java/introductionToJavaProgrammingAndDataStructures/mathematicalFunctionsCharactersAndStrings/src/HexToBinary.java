package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class HexToBinary {
    /*  Write a program that prompts the user to enter a hex digit and displays its corresponding binary number. For
        an incorrect input, display invalid input.
        Sample run:
            Enter a hex digit: B
            The binary value is 1011

            Enter a hex digit: G
            G is an invalid input
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit: ");
        String hexDigit = input.nextLine();
        if(hexDigit.equals("0")){
            System.out.println("The binary value is 0000");
        } else if (hexDigit.equals("1")){
            System.out.println("The binary value is 0001");
        } else if (hexDigit.equals("2")) {
            System.out.println("The binary value is 0010");
        } else if (hexDigit.equals("3")){
            System.out.println("The binary value is 0011");
        } else if (hexDigit.equals("4")){
            System.out.println("The binary value is 0100");
        } else if (hexDigit.equals("5")) {
            System.out.println("The binary value is 0101");
        } else if (hexDigit.equals("6")){
            System.out.println("The binary value is 0110");
        }  else if (hexDigit.equals("7")) {
            System.out.println("The binary value is 0111");
        } else if (hexDigit.equals("8")){
            System.out.println("The binary value is 1000");
        } else if (hexDigit.equals("9")){
            System.out.println("The binary value is 1001");
        } else if (hexDigit.equals("A")) {
            System.out.println("The binary value is 1010");
        } else if (hexDigit.equals("B")){
            System.out.println("The binary value is 1011");
        }  else if (hexDigit.equals("C")) {
            System.out.println("The binary value is 1100");
        } else if (hexDigit.equals("D")){
            System.out.println("The binary value is 1101");
        } else if (hexDigit.equals("E")){
            System.out.println("The binary value is 1110");
        } else if (hexDigit.equals("F")) {
            System.out.println("The binary value is 1111");
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}
