package com.company;

import java.util.Scanner;

public class SimpleBot {

    public static void main(String[] args) {
		Bot bot = new Bot();
		Scanner scanner = new Scanner(System.in);

    	System.out.println("Hello! My name is " + bot.getName());
		System.out.println("I was created in " + bot.getBirthYear());
		System.out.println("Please, remind me your name.");

		String name = scanner.nextLine();
		System.out.println("What a great name you have, " + name + "!");

		System.out.println("Let me guess your age.");
		System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
		int remainder3 = scanner.nextInt();
		int remainder5 = scanner.nextInt();
		int remainder7 = scanner.nextInt();
		int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
		System.out.println("Your age is " + age);
    }
}
