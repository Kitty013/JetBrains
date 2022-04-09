package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Bot bot = new Bot();
		Scanner scanner = new Scanner(System.in);

    	System.out.println("Hello! My name is " + bot.getName());
		System.out.println("I was created in " + bot.getBirthYear());
		System.out.println("Please, remind me your name.");

		String name = scanner.nextLine();
		System.out.println("What a great name you have, " + name + "!");
    }
}
