package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

public class TestSum {
    // presents an example summing a series that starts with 0.01 and ends with 1.0. The numbers in the series will
    // increment by 0.01, as follows: 0.01, 0.02, 0.03, and so on.
    public static void main(String[] args) {
        // Initialize sum
        float sum = 0;

        // Add 0.01, 0.02, 0.03, 0.99, 1 to sum
        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
            sum += i;

        // Display result
        System.out.println("The sum is " + sum);
    }
}
