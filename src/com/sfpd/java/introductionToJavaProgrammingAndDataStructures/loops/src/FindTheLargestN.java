package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

public class FindTheLargestN {
    //  Use a while loop to find the largest integer n such that Math.pow(n,2) is less than 12000.
    public static void main(String[] args) {
        int n = 0;

        while (Math.pow(n, 2) < 12000) {
            n++;
        }
        n--;
        System.out.println(n + " is the largest integer n, such that n^2 is less than 12,000");
        System.out.println("Proof: " + (n - 1) + "^2 = " + Math.pow(n - 1, 2));
        System.out.println("Proof: " + n + "^2 = " + Math.pow(n, 2));
        System.out.println("Proof: " + (n + 1) + "^2 = " + Math.pow(n + 1, 2));
    }
}
