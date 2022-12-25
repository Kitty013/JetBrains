package com.sfpd.java.simpleBot.doc;

import java.util.Scanner;

public class HiringAChef {
    /** Imagine that you are an HR manager at a restaurant and you need to
     *  hire a chef. To do that, you need to collect some preliminary data
     *  about the candidates. You have a special form for the candidates
     *  that includes 3 fields: first name, years of experience and cuisine
     *  preference. Your program should read all the words (or numbers) from
     *  the three lines and output "The form for first name is completed.
     *  We will contact you if we need a chef who cooks cuisine preference
     *  dishes and has years of experience years of experience."
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        String expierence = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        String preference = scanner2.nextLine();
        System.out.println("The form for " + firstName + " is completed." +
                " We will contact you if we need a chef who cooks " +
                preference + " dishes and has " + expierence +
                " years of expierence.");
    }
}
