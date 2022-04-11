package com.company.docSimpleBot;

import java.util.Scanner;

public class GuestListOfHotel {
    /** Guest list of a hotel:
     *  Read the names of the registered guests from the list and output each name
     *  a separate line and in reverse order starting with the last registered guest.
     *  Note that the order of the guests registered in each room is undefined.
     *  Input : 	Jane Kate
     *  			John
     *  			Mary Susan Paul
     *  			Boris Ann
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String secondName = scanner.next();
        String thirdName = scanner.next();
        String forthName = scanner.next();
        String fifthName = scanner.next();
        String sixthName = scanner.next();
        String seventhName = scanner.next();
        String eightName = scanner.next();

        System.out.println(eightName);
        System.out.println(seventhName);
        System.out.println(sixthName);
        System.out.println(fifthName);
        System.out.println(forthName);
        System.out.println(thirdName);
        System.out.println(secondName);
        System.out.println(firstName);
    }
}
