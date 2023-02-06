package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class PickACard {
    /* Write a program that simulates picking a card from a deck of 52 cards. Your program should display the rank
    (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Spades, Hearts) of the card.
     */
    public static void main(String[] args) {
        // ask from the user to pick a card from the deck
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 52 to pick a card from the deck: ");
        int pick = input.nextInt();

        // initialize a deck of 52 cards
        String card = "";
        switch (pick) {
            case 1: card = "Ace of Clubs"; break;
            case 2: card = "Queen of Hearts"; break;
            case 3: card = "5 of Spades"; break;
            case 4: card = "4 of Clubs"; break;
            case 5: card = "5 of Hearts"; break;
            case 6: card = "8 of Spades"; break;
            case 7: card = "7 of Clubs"; break;
            case 8: card = "King of Hearts"; break;
            case 9: card = "9 of Clubs"; break;
            case 10: card = "King of Diamonds"; break;
            case 11: card = "King of Spades"; break;
            case 12: card = "7 of Hearts"; break;
            case 13: card = "Jack of Clubs"; break;
            case 14: card = "Ace of Diamonds"; break;
            case 15: card = "2 of Diamonds"; break;
            case 16: card = "4 of Hearts"; break;
            case 17: card = "4 of Diamonds"; break;
            case 18: card = "8 of Hearts"; break;
            case 19: card = "Queen of Spades"; break;
            case 20: card = "9 of Spades"; break;
            case 21: card = "2 of Hearts"; break;
            case 22: card = "9 of Diamonds"; break;
            case 23: card = "10 of Diamonds"; break;
            case 24: card = "2 of Clubs"; break;
            case 25: card = "6 of Hearts"; break;
            case 26: card = "Jack of Spades"; break;
            case 27: card = "Ace of Spades"; break;
            case 28: card = "2 of Spades"; break;
            case 29: card = "3 of Spades"; break;
            case 30: card = "9 of Hearts"; break;
            case 31: card = "10 of Clubs"; break;
            case 32: card = "10 of Hearts"; break;
            case 33: card = "7 of Spades"; break;
            case 34: card = "3 of Clubs"; break;
            case 35: card = "6 of Clubs"; break;
            case 36: card = "10 of Spades"; break;
            case 37: card = "7 of Diamonds"; break;
            case 38: card = "King of Clubs"; break;
            case 39: card = "6 of Diamonds"; break;
            case 40: card = "Ace of Hearts"; break;
            case 41: card = "Jack of Diamonds"; break;
            case 42: card = "3 of Hearts"; break;
            case 43: card = "8 of Diamonds"; break;
            case 44: card = "3 of Diamonds"; break;
            case 45: card = "5 of Clubs"; break;
            case 46: card = "Queen of Diamonds"; break;
            case 47: card = "Queen of Clubs"; break;
            case 48: card = "5 of Diamonds"; break;
            case 49: card = "4 of Spades"; break;
            case 50: card = "6 of Spades"; break;
            case 51: card = "8 of Clubs"; break;
            case 52: card = "Jack of Hearts"; break;
        }
        // display the card picked
        System.out.println("You picked " + card);
    }
}
