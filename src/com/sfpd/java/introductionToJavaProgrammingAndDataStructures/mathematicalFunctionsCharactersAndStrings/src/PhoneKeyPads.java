package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class PhoneKeyPads {
    /* 2 = abc  3 = def     4 = ghi     5 = jkl     6 = mno     7 = pqrs    8 = tuv     9 = wxyz
        Write a program that prompts the user to enter a lowercase or uppercase letter and displays its corresponding
        number. For a nonletter input, display  invalid input.
        Sample run:
            Enter a letter: A
            The corresponding number is 2

            Enter a letter: a
            The corresponding number is 2

            Enter a letter: +
            + is an invalid input
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter = input.next();

        if(letter.equals("A") || letter.equals("a") || letter.equals("B") || letter.equals("b") || letter.equals("C") || letter.equals("c")){
            System.out.println("The corresponding number is 2");
        } else if (letter.equals("D") || letter.equals("d") || letter.equals("E") || letter.equals("e") || letter.equals("F") || letter.equals("f")){
            System.out.println("The corresponding number is 3");
        } else if (letter.equals("G") || letter.equals("g") || letter.equals("H") || letter.equals("h") || letter.equals("I") || letter.equals("i")) {
            System.out.println("The corresponding number is 4");
        } else if (letter.equals("J") || letter.equals("j") || letter.equals("K") || letter.equals("k") || letter.equals("L") || letter.equals("l")) {
            System.out.println("The corresponding number is 5");
        } else if (letter.equals("M") || letter.equals("m") || letter.equals("N") || letter.equals("n") || letter.equals("O") || letter.equals("o")) {
            System.out.println("The corresponding number is 6");
        } else if (letter.equals("P") || letter.equals("p") || letter.equals("Q") || letter.equals("q") || letter.equals("R") || letter.equals("r") || letter.equals("S") || letter.equals("s")) {
            System.out.println("The corresponding number is 7");
        } else if (letter.equals("T") || letter.equals("t") || letter.equals("U") || letter.equals("u") || letter.equals("V") || letter.equals("v")) {
            System.out.println("The corresponding number is 8");
        } else if (letter.equals("W") || letter.equals("w") || letter.equals("X") || letter.equals("x") || letter.equals("Y") || letter.equals("y") || letter.equals("Z") || letter.equals("z")) {
            System.out.println("The corresponding number is 9");
        } else {
            System.out.println(letter + " is an invalid input.");
        }
    }
}
