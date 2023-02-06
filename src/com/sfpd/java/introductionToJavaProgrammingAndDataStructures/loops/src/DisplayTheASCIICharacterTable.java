package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

public class DisplayTheASCIICharacterTable {
    /*  Write a program that prints the characters in the ASCII character table from ! to -. Display 10 characters per
        line. Characters are separated by exactly one space.
     */
    public static void main(String[] args) {
        char i = '!' - 1;
        int NUMBERS_PER_LINE = 10;
        int count = 0;

        while (i < '~'){
            i++;
            count++;
            if (count % NUMBERS_PER_LINE == 0){
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
//        This is a shorter way to write:
//        for (char i = '!', count = 1; i <= '~'; i++)
//            System.out.print((count++ % 10 != 0) ? (char)i + " " : (char)i + "\n");
    }
}
