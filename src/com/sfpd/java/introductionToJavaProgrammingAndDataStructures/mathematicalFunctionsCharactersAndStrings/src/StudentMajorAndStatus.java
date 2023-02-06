package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class StudentMajorAndStatus {
    /*  Write a program that prompts the user to enter two characters and displays the major and status represented in
        the characters. The first character indicates the major and the second is number character 1, 2, 3, 4, which
        indicates whether a student is a freshman, sophomore, junior, or senior. Suppose the following characters are
        used to denote the majors:
                            I: Information Management
                            C: Computer Science
                            A: Accounting
        Sample run:
            Enter two characters: I1
            Information Management Freshman

            Enter two characters: A3
            Accounting Junior

            Enter two characters: T3
            Invalid input

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        String ch = input.nextLine();
        char major = ch.charAt(0);
        char status = ch.charAt(1);
        String majorName = new String();
        String statusName = new String();

        if(major == 'I'){
            majorName = "Information Management";
        } else if(major == 'A'){
            majorName = "Accounting";
        } else if(major == 'C'){
           majorName = "Computer Science";
        } else {
            System.out.println("Invalid input");
        }

        if(status == 49){
            statusName = "Freshman";
        } else if(status == 50){
            statusName = "Sophomore";
        } else if(status == 51){
            statusName = "Junior";
        } else if(status == 52){
            statusName = "Senior";
        } else {
            System.out.println("Invalid input");
        }

        System.out.println(majorName + " " + statusName);
    }
}
