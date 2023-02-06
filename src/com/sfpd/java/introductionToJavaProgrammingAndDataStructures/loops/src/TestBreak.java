package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

public class TestBreak {
    // The program adds integers from 1 to 20 in this order to sum until sum is grater than or equal to 100.
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100)
                break;
        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
