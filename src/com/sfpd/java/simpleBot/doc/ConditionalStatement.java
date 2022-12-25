package com.sfpd.java.simpleBot.doc;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        singleIfCase();
        ifElseCases();
        ifElseIfCases();
        //armyOfUnits();
        //symmeticalNumber();
        chocolate();
        //leapYear();
        //checkPositiveNumber();
        //checkTriangle();
        //checkHealtySleep();
        //interval();
    }

    /** Condition statement is a construction that allows a program to perform
     *  different computations depending on the value of a boolean expression.
     *  If true, it performs one computation; otherwise, if false, it performs
     *  another computation.
     *  Ex. a > b, i - j == 1
     */

    /** THE SINGLE IF-CASE
     *  If the expression is true, the statements inside the code block are
     *  executed; otherwise, the program skips them.
     */
    private static void singleIfCase() {
        int age = 102;
        if (age > 100) {
            System.out.println("Very experienced person");
        }
    }

    /** THE IF-ELSE-CASES
     *  If the expression is true, then the first code block is executed; otherwise
     *  the second block is executed, but not both together
     */
    private static void ifElseCases() {
        int num = 154;

        if (num % 2 == 0) {
            System.out.println("It's an even number");
        } else {
            System.out.println("It's an odd number");
        }
    }

    /** THE IF-ELSE-IF-CASES
     *  a conditional statement with multiple branches creates a decision tree,
     *  whose nodes consist of boolean expressions, and each branch is marked
     *  with true of false. The true-branch leads to a block of statements to
     *  be executed and a false-branch leads to the next condition to be checked.
     *  The last false-branch means "in all other cases".
     */
    private static void ifElseIfCases() {
        long dollars = 15000;

        if (dollars < 1000) {
            System.out.println("Buy a laptop");
        } else if (dollars < 2000) {
            System.out.println("Buy a personal computer");
        } else if (dollars < 100_000) {
            System.out.println("Buy a server");
        } else {
            System.out.println("Buy a data center or a quantum computer");
        }
    }

    /** THE ARMY OF UNITS
     *  In a computer game, each gamer has an army of units. Write a program that
     *  will classify the army of your enemies corresponding to the following
     *  rules:
     *      less than 1: no army
     *      from 1 to 19: pack
     *      from 20 to 249: throng
     *      from 250 to 999: zounds
     *      from 1000 to more : legion
     */
    private static void armyOfUnits() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of units: ");
        int number = input.nextInt();

        if (number < 1) {
            System.out.println("no army");
        } else if (number >= 1 && number <= 19) {
            System.out.println("pack");
        } else if (number >= 20 && number <= 249) {
            System.out.println("throng");
        } else if (number >= 250 && number <= 999) {
            System.out.println("zounds");
        } else if (number >= 1000){
            System.out.println("legion");
        } else {
            System.out.println("Can't determine the army!");
        }
    }

        /** SYMMETRICAL NUMBER
         *  Given a four-digit number, determine whether its decimal notation is
         *  symmetric. If the number is symmetric, output 1; otherwise, output any
         *  other integer.
         */
        private static void symmeticalNumber(){
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int n1 = number/1000;
            int n2 = (number/100) % 10;
            int n3 = (number/10) % 10;
            int n4 = number%10;

            if (n1 == n4 && n2 == n3) {
                System.out.println("1");
            } else {
                System.out.println(number);
            }
        }

    /** CHOCOLATE
     *  Image a chocolate bar. Remember how it is usually spit into smaller bits
     *  by a special grid?
     *  Now think o chocolate as an N x M rectangle divided into little segments:
     *  N segments in length and M in width. Each segment is 1 x 1 and unbreakable
     *  Find out whether it is possible to break off exactly K segments from the
     *  chocolate with a single straight line: vertical or horizontal
     */
    private static void chocolate() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        boolean val1 = K >= N || K >= M;
        boolean val2 = K < N * M;
        boolean val3 = K % M == 0 || K % N == 0;
        if (val1 && val2 && val3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    /** LEAP YEAR
     *  Find whether the given year is a leap year. Just a reminder: leap years
     *  are those years in which the year's number is either divisible by 4,
     *  but not divisible by 100, or divisible by 400.
     *  The program should work correctly for the years 1900 <= n <= 3000
     *  Output "Leap" (case-sensitive) if the given year is a leap year, and
     *  "Regular" otherwise.
     *  It is enough to write a simple conditional statement to solve this task.
     */
    private static void leapYear() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (1900 <= input && input <= 3000) {
            boolean isLeapYear = (input % 4 == 0 && input % 100 != 0 || (input % 400 == 0));
            if (isLeapYear) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        }
    }

        /** CHECK A NUMBER IS POSITIVE
         *  Write a program that reads the number and prints YES if it is positive.
         *  Otherwise, the program should print NO.
         *  Don't forget that zero is not a positive number.
         */
        private static void checkPositiveNumber() {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
    }

    /** TRIANGLE
     *  Given three natural numbers A, B, and C. Determine if a triangle with these
     *  sides can exist.
     *  If the triangle exists, output the "YES" string; otherwise, output "NO".
     *  A triangle is valid if the sum of its two sides is greater than the third
     *  side. If three sides are A, B, and C, then three conditions should be met.
     *      A + B > C
     *      A + C > B
     *      B + C > A
     */
    private static void checkTriangle() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    /** HEALTHY SLEEP
     *  Ann watched a health TV program and learned that oversleeping is as bad
     *  for your health as not getting enough sleep. She decided to follow TV
     *  recommendations and keep track of how many hours she spends sleeping.
     *  You are given three numbers: A, B and H. According to TV, one should
     *  sleep at least A hours per day, but no more than B hours. H is how many
     *  hours Ann sleeps.
     *  Task: If Ann sleeps less than A hours, print "Deficiency". If she sleeps
     *        more then B hours, print "Excess". If her sleep fits the
     *        recommendations, print "Normal".
     *  Input format: three numbers A, B, H, where A is always less than or equal to B.
     */
    private static void checkHealtySleep() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        if (h < a) {
            System.out.println("Deficiency");
        } else if(h > b){
            System.out.println("Excess");
        } else {
                System.out.println("Normal");
        }
    }

    /** INTERVAL
     *  Given an integer as an input, print True if its value falls within the
     *  interval (-15,12]u(14,17)u[19,+19). Otherwise, print False (case sensitive)
     *  Notes:
     *      - numbers denoted with a parenthesis () are exclusive
     *      - numbers denoted with a square bracket [] are inclusive.
     */
    private static void interval() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean interval1 = num > -15 && num < 13;
        boolean interval2 = num > 14 && num < 17;
        boolean interval3 = num >= 19;
        if (interval1 || interval2 || interval3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
