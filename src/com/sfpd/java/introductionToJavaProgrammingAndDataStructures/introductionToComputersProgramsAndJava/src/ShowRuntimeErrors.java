package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.introductionToComputersProgramsAndJava.src;

public class ShowRuntimeErrors {
    /** Runtime errors are errors that cause a program to terminate abnormally.
     *  They occur while a program is running if the environment detects an
     *  operation that is impossible to carry out. An input error occurs when
     *  the program is waiting for the user to enter a value, but the user
     *  enters a value that the program cannot handle.
     */

    //The runtime error causes the program to terminate abnormally
    public static void main(String[] args) {
        System.out.println(1 / 0);
    }
}
