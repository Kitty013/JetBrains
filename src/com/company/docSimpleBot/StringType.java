package com.company.docSimpleBot;

import java.util.Locale;
import java.util.Scanner;

public class StringType {
    public static void main(String[] args) {
        //string();
        //creatingStrings();
        //lengthAndCharacters();
        //usefulMethodsOfStrings();
        //nullpointerException();
        //stringOutOfBoundsException();
        //concatenatingStrings();
        //appendingValuesToAString();
        //howToCompareStringsCorrectly();
        //checkPrefixIgnoringTheCase();
        //comparingStringsIgnoringWhitespaces();
        //replacingAwithB();
        //extractingASubstring();
        checkBurgs();
    }

    /** THE STRING TYPE
     *  it's impossible to change a character in a string;
     *  it has methods for getting individual characters and extracting substrings;
     *  individual characters can be accessed by indexas, the first characters has
     *  the index 0, the last one - the length of the string -1;
     *  non-primitive type
     */
    public static void string(){
        System.out.println("This is a string!");
    }

    /** CREATING STRINGS
     *  A string is surrounded by a pair of double quotes;
     *  A string can represent a long character sequence;
     *  A string can have one or zero characters;
     *  A string can be null;
     *  create a variable of string by using the keyword new.
     */
    public static void creatingStrings() {
        String simpleString = "It is a simple string";
        System.out.println(simpleString);

        String anotherString = "This is \na multilple\nstring";
        System.out.println(anotherString);

        String strangeText = "aaaaaaaaaaaaaaaaassssssssssssss gggggggggg ddddd qqqqqqqqqqqq fffff";
        System.out.println(strangeText);

        String emptyString = "";
        System.out.println(emptyString);

        String singleChar = "s";
        System.out.println(singleChar);

        String nullString = null;
        System.out.println(nullString);

        String str = new String("my-string");
        System.out.println(str);
    }

    /** GET THE LENGTH AND CHARACTERS OF A STRING
     *  length() returns the number of characters in the string;
     *  charAt(int index) returns a character by its index;
     */
    public static void lengthAndCharacters(){
        String s = "Hi, all";

        int len = s.length();  // the len is 7
        System.out.println(len);
        char theFirstChar = s.charAt(0); // "H" has the index 0
        System.out.println(theFirstChar);
        char theFifthChar = s.charAt(4); // "a" has the index 4
        System.out.println(theFifthChar);
        char theLastChar = s.charAt(s.length() - 1);
        System.out.println(theLastChar);
    }

    /** USEFUL METHODS OF STRINGS
     *  isEmpty() returns true if the string is empty, otherwise false;
     *  toUpperCase() returns a new string in uppercase;
     *  toLowerCase() returns a new string in lowercase;
     *  startsWith(prefix) returns true if the string starts with the given string
     *      prefix, otherwise false;
     *  endsWith(suffix) returns true if the string ends with the given string suffix
     *      otherwise false;
     *  contains(...) returns true if the string contains the given string or character;
     *  substring(beginIndex, endIndex) returns a substring of the string in the
     *      range: beginIndex, endIndex - 1;
     *  replace(old, new) returns a new string obtained by replacing all occurrences
     *      of old with new that can be chars or strings.
     *  trim() returns a copy of the string obtained by omitting the leading and
     *      trailing whitespace.
     */
    public static void usefulMethodsOfStrings(){
        String text = "The simple text string";

        boolean empty = text.isEmpty(); // false
        System.out.println(empty);
        String textInUpperCase = text.toUpperCase();
        System.out.println(textInUpperCase);
        boolean startsWith = textInUpperCase.startsWith("THE"); // true
        System.out.println(startsWith);
        String noSpaces = textInUpperCase.replace(" ","");
        System.out.println(noSpaces);
        String textWithWhitespaces = "\t text with whitespaces    !\n    \t";
        String trimmedText = textWithWhitespaces.trim();
        System.out.println(textWithWhitespaces);
        System.out.println(trimmedText);
    }

    /** EXCEPTIONS WHEN PROCESSING STRINGS
     *  NullpointerException : If a string is null and you call a method of the
     *                         string, it throws a nullpointerException.
     *  StringIndexOutOfBoundsException : if you try to access a non-existing
     *                                    character by an index then this occurs
     */
    public static void  nullpointerException() {
        String s = null;
        int length = s.length(); // throws nullpointerException
    }

    public static void stringOutOfBoundsException() {
        String str = "ab";
        char c = str.charAt(2); // throws StringOutOfBoundsException
    }

    /** CONCATENATING STRINGS
     *  U can use the "+" operator or the concat method.
     */
    public static void concatenatingStrings() {
        String firstName = "John";
        String lastName = "Smith";

        String fullName1 = firstName + " " + lastName;
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println(fullName1);
        System.out.println(fullName2);
    }

    /** APPENDING VALUES TO A STRING
     *  It's possible to add values of differents types to a string. The order of
     *  operations is important.
     */
    public static void appendingValuesToAString() {
        String str = "str" + 10 + false;
        System.out.println(str); // the result is str10false

        String shortString = "str";
        int number = 10;

        String result1 = shortString + number + 50;
        System.out.println(result1); // the result is str10050

        String result2 = number + 50 + shortString;
        System.out.println(result2); // the result is 150str
    }

    /** HOW TO COMPARE STRINGS CORRECTLY?
     *  equals(other)
     *  equalsIgnoreCase(other)
     */
    public static void howToCompareStringsCorrectly() {
        String first = "first";
        String second = "second";

        String anotherFirst = "first";
        String secondInUpperCase = "SECOND";

        System.out.println(first.equals(second)); // false
        System.out.println(first.equals(anotherFirst)); // true

        System.out.println(second.equals(secondInUpperCase)); // false
        System.out.println(second.equalsIgnoreCase(secondInUpperCase)); // true
    }

    /** CHECK PREFIX IGNORING THE CASE
     *  Write a program that checks if a given string starts with the prefix
     *  "J" ignoring the case.
     *  The program should output true or false.
     */
    public static void checkPrefixIgnoringTheCase() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char c = s.charAt(0);
        String firstLetter = String.valueOf(c).toUpperCase();
        if(firstLetter.equals("J")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    /** COMPARING STRINGS IGNORING WHITESPACES
     *  Write a program that reads two lines and compares them without whitespaces
     *  The program should print true if both lines are equal, otherwise - false.
     */
    public static void comparingStringsIgnoringWhitespaces() {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        String formattedLine1 = line1.replace(" ","");
        String formattedLine2 = line2.replace(" ","");

        if (formattedLine1.equals(formattedLine2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    /** REPLACING A WITH B
     *  Write a program that reads a string and replaces all occurrences of the
     *  letter 'a' with the letter 'b'. The program should print out the
     *  resulting string.
     */
    public static void replacingAwithB() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String output = input.replace("a","b");
        System.out.println(output);
    }

    /** EXTRACTING A SUBSTRING
     *  Write a program that reads a string and two integer numbers. These two
     *  numbers are representing a range that includes them both. Print the
     *  substring enclosed in this range. Both numbers are always greater then or
     *  equal to 0 and less than the string length.
     */
    public static void extractingASubstring() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        String output = input.substring(number1,number2 + 1);
        System.out.println(output);
    }

    /** CHECK BURGS
     *  Write a program that reads the name of a city and checks if the name ends
     *  with "burg". Keep in mind, a city can have a short name.
     *  The program should output true or false.
     */
    public static void checkBurgs() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int length = input.length();

        if (length >= 4) {
            String lastFourLetters = input.substring((length - 4), length).toLowerCase(Locale.ROOT);
            if (lastFourLetters.equals("burg")){
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else {
            System.out.println(false);
        }
    }
}
