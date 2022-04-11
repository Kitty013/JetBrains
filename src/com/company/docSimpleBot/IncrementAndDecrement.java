package com.company.docSimpleBot;

import java.util.Scanner;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        //usingIncrementAndDecrement();
        //prefixIncrement();
        //postfixIncrement();
        //decrementAll();

    }

    /** USING ++ AND-- IN JAVA
     */
    public static void usingIncrementAndDecrement() {
        int n = 10;
        int increment = n++;
        int decrement = n--;
        System.out.println(n);         // 10
        System.out.println(increment); // 11
        System.out.println(decrement); // 10
        System.out.println(" ");
        int sameIncrement = n += 1;
        int sameDecrement = n -= 1;
        System.out.println(n);              // 10
        System.out.println(sameIncrement);  // 11
        System.out.println(sameDecrement);  // 10
    }

    /** PREFIX AND POSTFIX FORM
     *  prefix increases/decreases the value of a variable before it is used;
     *  postfix increases/decreases the value of a variable after it is used;
     */
    public static void prefixIncrement(){
        int a = 4;
        int b = ++a;

        System.out.println(a);  // 5
        System.out.println(b);  // 5
    }

    public static void postfixIncrement(){
        int a = 4;
        int b = a++;

        System.out.println(a);  // 5
        System.out.println(b);  // 4
    }

    /** DECREMENT ALL
     *  Write a program that reads four numbers and decrements each of them.
     *  The program must output the results in the same order separated by spaces.
     */
    public static void decrementAll(){
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.next());
        int n2 = Integer.parseInt(scanner.next());
        int n3 = Integer.parseInt(scanner.next());
        int n4 = Integer.parseInt(scanner.next());
        System.out.println(--n1 + " " + --n2 + " " + --n3 + " " + --n4);
    }

}
