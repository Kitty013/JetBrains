package com.sfpd.java.simpleBot.doc;

import java.util.Scanner;

public class IntegerTypesAndOperations {

    public static final int HUNDERD = 100;
    public static final int TEN = 10;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;

    public static void main(String[] args) {
//     integersOrLongs();
//     formOperator();
//     readingNumbersFromInput();
//     squirrelsAndNuts();
//     reversing();
//     arithemeticExpression();
//     howManyNutsEachSquirrelWillGet();
//     theSumOfDigits();
//     readingIntegerNumbers();
//     differenceOfTimes();
//     reversingInputNumbers();
//     tensDigit();
//     nextEvenNumber();
//     goodRestOnVacation();
       desks();
    }
    /** BASIC INFORMATION ON INTEGER TYPES
     *  The most used types are int and long.
     *  You can perform all arithmetic operations with variables of integer types.
     */
    int twelve = TWO + TEN; // 12
    int eight = TEN - TWO;  // 8
    int twenty = TWO * TEN; // 20
    int five = TEN / TWO;   // 5
    int zero = TEN % TWO;   // 0, no remainder

    int minusTwo = -TWO;    // -2

    /** To improve readability of your code, the special underscore character _
     *  can be used to separate groups of digits within a number.
     */
        private static void integersOrLongs() {
            int million = 1_000_000;
            System.out.println(million);

            int number = 100_000;
            System.out.println(number);

            long one = 1L;
            long twentyTwo = 33L;   // L is a literal for longs
            long bigNumber = 100_000_000_000L;

            long result = bigNumber + twentyTwo - one;
            System.out.println(result); // 100000000021
        }

        /** If a number ends with the letter L or l, it is considered as long,
         *  otherwise, it is int. We recommend to you L. Use long numbers when
         *  it is necessary (to process big numbers). Prefer the use of int numbers.
         */

    /** FORMS OF THE ASSIGNMENT OPERATOR
     */
    private static void formOperator() {
        int n = TEN;
        n = n + 4; // 14
        n += 4;    // 18
        System.out.println(n);
    }

    /** READING NUMBERS FROM THE STANDARD INPUT
     */
    private static void readingNumbersFromInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("The sum is " + sum);
    }

    /** SQUIRRELS AND NUTS
     *  N squirrels found K nuts and decided to divide them equally. Find how
     *  many nuts will be left after each of the squirrels take the equal
     *  amount of nuts. There are two positive integers N and K, each of them is
     *  not greater then 10000.
     */
    private static void squirrelsAndNuts(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of squirrels: ");
        int n = scanner.nextInt();

        System.out.println("Enter the number of nuts: ");
        int k = scanner.nextInt();

        int result = k % n;
        System.out.println("There are " + result + " nuts left.");
    }

    /** REVERSING
     *  Write a program that reads a three-digit number, calculates the new number
     *  by reversing its digits, and outputs the new number.
     */
    private static void reversing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse: ");
        int input = scanner.nextInt();

        int n1 = input / HUNDERD;
        int n2 = (input % HUNDERD) / TEN;
        int n3 = input % TEN;

        if (n3 == 0) {
            System.out.println(n2 +""+ n1);
        } else {
            System.out.println(n3 + "" + n2 + "" + n1);
        }
    }

    /** ARITHMETIC EXPRESSION
     *  Write a program that reads an integer value n from the standard input and
     *  outputs the result of the following arithemetic expression:
     *      ((n + 1) * n + 2) * n + 3
     */
    private static void arithemeticExpression(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for n : ");
        int n = scanner.nextInt();

        System.out.println(((n + ONE) * n + TWO) * n + THREE);
    }

    /** HOW MANY NUTS EACH SQUIRREL WILL GET
     *  N squirrels found K nuts and decided to divide them equally. Determine how
     *  many nuts each squirrel will get.
     *  Input data format:
     *  There are two positive numbers N and K, each of them is not greater then
     *  10000.
     */
    private static void howManyNutsEachSquirrelWillGet() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(k / n);
    }

    /** THE SUM OF DIGITS
     *  Given a three-digit integer (i.e. an integer from 100 to 999). Find the
     *  sum of its digits.
     */
    private static void theSumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        int n1 = digit / HUNDERD;
        int n2 = (digit % HUNDERD) / TEN;
        int n3 = digit % TEN;

        System.out.println(n1 + n2 + n3);
    }

    /** READING INTEGER NUMBERS
     *  Write a program that reads four integer numbers from one line and prints
     *  them each in a new line. In the input line numbers are separated by one
     *  or more spaces.
     */
    private static void readingIntegerNumbers() {
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.next();
        String n2 = scanner.next();
        String n3 = scanner.next();
        String n4 = scanner.next();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }

    /** DIFFERENCE OF TIMES
     *  Find how many seconds passed between the two moments of time on the
     *  same day.
     *  You are given the integer values representing these moments: hours,
     *  minutes and seconds for each of them. It is guaranteed that the
     *  earliest moment goes first in the input.
     *  Input data format:
     *  The program gets the input of six integers: three defining the second
     *  one.
     *  For example, six numbers, 1,2,30,15,21,1 will represent two moments of
     *  time: 1:02:30 am and 3:21:01 pm (or just 15:21:01)
     *  Output data format:
     *  Just one number: seconds between these two moments of time. I's 51511
     *  (14 hours, 18 minutes and 31 seconds) in our example.
     */
    private static void differenceOfTimes(){
        Scanner scanner = new Scanner(System.in);
        int t1_hours = scanner.nextInt();
        int t1_minutes = scanner.nextInt();
        int t1_seconds = scanner.nextInt();
        int t2_hours = scanner.nextInt();
        int t2_minutes = scanner.nextInt();
        int t2_seconds = scanner.nextInt();
        int t1 = t1_seconds + (t1_minutes * 60) + (t1_hours * 3600);
        int t2 = t2_seconds + (t2_minutes * 60) + (t2_hours * 3600);
        System.out.println(t2 - t1);
    }

    /** REVERSING INPUT NUMBERS
     *  Write a program that reads two integer numbers from the standard input
     *  and outputs them in the reverse order separated by one space.
     */
    private static void reversingInputNumbers(){
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.next();
        String n2 = scanner.next();

        System.out.println(n2 + " " + n1);
    }

    /** TENS DIGIT
     *  Write a program that finds the tens digit in a non-negative integer N
     *  (0<= N <= 1000000).
     *  Take a look at the examples:
     *  If N is 264, then tens digit is 6.
     *  If N is 4136, then tens digit is 3.
     *  If N is 101, then thens digit is 0.
     */
    private static void tensDigit() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int tensDigit = (input / 10) % 10;
        System.out.println(tensDigit);
    }

    /** NEXT EVEN NUMBER
     *  Given a natural number, not greater than 10000. Output the even number
     *  following this number.
     */
    private static int nextEvenNumber() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int output = 0;
        if (input % 2 == output) {
            output = input + 2;
        } else {
            output = input + 1;
        }
        System.out.println(output);
        return output;
    }

    /** GOOD REST ON VACATION
     *  Write a program that will help people who are going on vacation. The
     *  program should calculate the total required sum of money to have a good
     *  rest for a given duration.
     *  There are four parameters which have to be considered:
     *      duration in days
     *      total food cost per day
     *      one-way flight cost
     *      cost of one night in a hotel ( the number of nights equal duration
     *      minus one)
     *  Read values of these parameters from the standard input and then print
     *  the result.
     */
    private static void goodRestOnVacation(){
        Scanner scanner = new Scanner(System.in);
        String days = scanner.next();
        String foodCost = scanner.next();
        String ticket = scanner.next();
        String hotel = scanner.next();
        int totalFoodCost = Integer.parseInt(foodCost) * Integer.parseInt(days);
        int totalTickets = Integer.parseInt(ticket) * 2;
        int totalHotel = Integer.parseInt(hotel) * (Integer.parseInt(days) - 1);
        System.out.println(totalHotel + totalTickets + totalFoodCost);
    }

    /** DESKS
     *  A university has decides to open match courses and equip classrooms for
     *  3 groups with new special desks. The faculty agreed that for the sake of
     *  productivity, only two students may share one desk. The enrollment has
     *  ended, and now the task is to count the number of desks to order the
     *  correct number from the shop. Of course, the university is short of money,
     *  so you need to calculate the minimum number of desks. But don't forget
     *  that each group will sit in its own classroom!
     *  Input data format:
     *  The program receives the input of the three non-negative integers: the
     *  number of students in each of the three groups (the numbers are not
     *  bigger than 1000).
     */
    private static void desks() {
        Scanner scanner = new Scanner(System.in);
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();
        int desksClass1 = class1 / 2;
        int desksClass2 = class2 / 2;
        int desksClass3 = class3 / 2;
        if (class1 % 2 != 0){
            desksClass1 = desksClass1 + 1;
        }
        if (class2 % 2 != 0){
            desksClass2 = desksClass2 + 1;
        }
        if(class3 % 2 != 0){
            desksClass3 = desksClass3 + 1;
        }
        int result = desksClass1 + desksClass2 + desksClass3;
        System.out.println(result);
    }
}
