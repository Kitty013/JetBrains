package com.company.doc;

import java.util.Scanner;

public class RelationalOperators {

    private static final int TWENTY = 20;
    private static final int TEN = 10;
    private static final int ZERO = 0;
    private static final int FIFTHTEEN = 15;
    private static final int TWENTYFIVE = 25;

    public static void main(String[] args) {
        //listOfRelationalOperators();
        //joiningRelationalOperatorsUsingLogicalOperators();
        //checkDescOrder();
        //checkTheSum();
        //checkTheValue();
        //checkTheGivenNumbersAreDifferent();
        //isBetween();
        //boysInSportClass();
        //groundhogsAtAParty();
        exactlyOneParameterIsPositive();
    }

    /** LIST OF RELATIONAL OPERATORS
     *  ==  equal to
     *  !=  not equal to
     *  >   greater than
     *  >=  greater than or equal to
     *  <   less than
     *  <=  less than or equal to
     *  Relational operators have lesser priorities then arithmetic operators.
     */
    public static void listOfRelationalOperators() {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;

        boolean oneIsOne = one == one; //true
        System.out.println(oneIsOne);

        boolean res1 = two <= three; //true
        System.out.println(res1);
        boolean res2 = two != four; //true
        System.out.println(res2);
        boolean res3 = two > four; //false
        System.out.println(res3);
        boolean res4 = one == three; //false
        System.out.println(res4);

        int number = 1000;
        boolean result = number + 10 > number + 9; //1010 > 1009 is true
        System.out.println(result);
    }

    /** JOINING RELATIONAL OPERATORS USING LOGICAL OPERATORS
     *  Use logical operators like || and && to join two boolean expressions.
     *  Relational operators have a higher priority than logical operators.
     *  Logical operators allow you to join a sequence of relational operations
     *  into one expression.
     */
    public static void joiningRelationalOperatorsUsingLogicalOperators() {
        int number = 10;
        int low = 100, high = 200;

        boolean inRange = number > low && number < high;
        System.out.println(inRange);
    }

    /** EXAMPLE OF A PROGRAM
     *  You want to check if their heights are arranged in descending order. The
     *  following program reads three integer numbers h1, h2 and h3 and then
     *  checks if h1 >= h2 and h2 >= h3.
     */
    public static void checkDescOrder() {
        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean descOrdered = (h1 >= h2) && (h2 >= h3);
        System.out.println(descOrdered);
    }

    /** CHECK THE SUM
     *  Write a program that reads the numbers a,b,c and checks if there's a pair
     *  of them that adds up to exactly 20.
     *  The program must output true or false.
     */
    public static void checkTheSum() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean checkTheSum = a + b == TWENTY || b + c == TWENTY || c + a == TWENTY;
        System.out.println(checkTheSum);
    }

    /** CHECK THE VALUE
     *  Write a program that reads an integer value and checks if it is less than
     *  10 and greater than 0.
     *  Your program should output a boolean value.
     */
    public static void checkTheValue() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean checkTheValue = number < TEN && number > ZERO;
        System.out.println(checkTheValue);
    }

    /** CHECK THE GIVEN NUMBERS ARE DIFFERENT
     *  Write a program that reads three numbers and checks that they all are
     *  different, i.e. not equal to one another.
     *  The output should be true or false.
     */
    public static void checkTheGivenNumbersAreDifferent() {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        boolean checkIfNumbersAreDifferent = n1 != n2 && n2 != n3 && n3 != n1;
        System.out.println(checkIfNumbersAreDifferent);
    }

    /** IS BETWEEN
     *  Write a program that reads three integer numbers and prints true if the
     *  first number is between the second and the third one (inclusive). Otherwise,
     *  it must print false. The last two arguments may not be sorted.
     */
    public static void isBetween() {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        boolean isBetween = n1 >= n2 && n1 <= n3 || n1 >= n3 && n1 <= n2;
        System.out.println(isBetween);
    }

    /** BOYS IN A SPORT CLASS
     *  You need to write a program that checks if the boys are arranged in
     *  ascending or descending order by height. The program must read three
     *  integer numbers h1,h2,h3 and outputs true or false. If boys have the
     *  same height, they are considered as correctly arranged.
     */
    public static void boysInSportClass() {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean boysInDesOrAscOrder = h1 <= h2 && h2 <= h3 || h3 <= h2 && h2 <= h1;
        System.out.println(boysInDesOrAscOrder);
    }

    /** GROUNDHOGS AT A PARTY
     *  Groundhogs like to throw fun parties, and at their parties, they like to
     *  eat Reese's peanut butter cups. But not too many of them, or they feel
     *  sick! A successful groundhog party will have between 10 and 20 Reese's
     *  peanut butter cups, inclusive, unless it is in the weekend, in which case
     *  they will need 15 to 25 Reese's peanut butter cups, inclusive.
     *
     *  Write a program that reads two values:
     *  the first is the number of Reese's peanut butter cups
     *  the second is a boolean representing whether it is the weekend
     *  The program must print a boolean value that indicates whether the party
     *  was successful.
     */
    public static void groundhogsAtAParty() {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean party = !weekend && cups >= TEN && cups <= TWENTY ||
                        weekend && cups >= FIFTHTEEN && cups <= TWENTYFIVE;

        System.out.println(party);
    }

    /** EXACTLY ONE PARAMETER IS POSITIVE
     *  Write a program that reads three integer numbers and prints true if
     *  exactly ONE number is positive. Otherwise, it should print false.
     */
    public static void exactlyOneParameterIsPositive() {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        boolean isOneNumberPositive = n1 > ZERO && n2 <= ZERO && n3 <= ZERO ||
                                      n1 <= ZERO && n2 > ZERO && n3 <= ZERO ||
                                      n1 <= ZERO && n2 <= ZERO && n3 > ZERO;
        System.out.println(isOneNumberPositive);
    }
}
