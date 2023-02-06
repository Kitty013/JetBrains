package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

public class FindTheSmallestN {
    //  Use a while loop to find the smallest integer n such that Math.pow(n,3) > 12000.
    public static void main(String[] args) {
        int n = 0;

        while (Math.pow(n, 3) < 12000) {
            n++;
        }

        System.out.println(n + " is the lowest number, such that n^3 is greater than 12,000");
        System.out.println("Proof: " + (n - 1) + "^3 = " + Math.pow(n - 1, 3));
        System.out.println("Proof: " + n + "^3 = " + Math.pow(n, 3));
        System.out.println("Proof: " + (n + 1) + "^3 = " + Math.pow(n + 1,3));
    }
}
