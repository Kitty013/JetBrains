package com.company.doc;

public class Characters {
    public static void main(String[] args) {
        characters();
        subsequentCharacters();
        escapeSequences();
    }

    /** THEORY
     *  The char type is used to represent letters (both uppercase and lowercase),
     *  digits, and other symbols and are enclosed by single quotes
     */

    char lowerCaseLetter = 'a';
    char upperCaseLetter = 'Q';
    char number = '1';
    char space = ' ';
    char dollar = '$';

    /** INITIALIZING CHARACTERS WITH CODES
     *  A character can be also created using it's hexadecimal code.
     *  Minimal value encoded is '\u0000' and maximum value encoded is '\uffff'.
     *  It is also possible to initialize a char with a positive integer number.
     *  Any char variable may be considered as an unsigned integer value in the
     *  range from 0 to 65535.
     */
    public static void characters(){
        char ch = '\u0040'; // it represents '@'
        System.out.println(ch); // @

        char charNumber = 64;
        System.out.println(charNumber); // @
    }

    /** RETRIEVING SUBSEQUENT CHARACTERS
     *  There are two operators for adding and subtracting integer numbers in
     *  order to get the next and previous character according to the Unicode
     *  order.
     *  It is possible to use increment and decrement operators in prefix and
     *  postfix forms
     */
    public static void subsequentCharacters(){
        char ch = 'b';
        System.out.println(ch);
        ch += 1; // 'c'
        System.out.println(ch);
        ch -= 2; // 'a'
        System.out.println(ch);

        ch = 'b';
        System.out.println(ch);
        ch += 'a';
        System.out.println(ch);
        ch -= 'b';
        System.out.println(ch); // prints 'a' without quotes

        ch = 'A';
        System.out.println(ch);
        ch += 10;
        System.out.println(ch);     // 'K'
        System.out.println(++ch);   // 'L'
        System.out.println(++ch);   // 'M'
        System.out.println(--ch);   // 'L'
    }

    /** ESCAPE SEQUENCES
     *  There are some special characters starting with backslash \ which are known
     *  as the escape or control sequences. To represent such characters we use a
     *  pair of regular symbols.
     */
    public static void escapeSequences() {
        System.out.print('\n');     // goes to a new line
        System.out.print('\t');     // makes a tab
        System.out.print('\r');     // is the carriage return character
        System.out.print('\\');     // is the backslash character itself
        System.out.print('\'');     // is the single quote mark
        System.out.print('\"');     // is the double quote mark
    }
}
