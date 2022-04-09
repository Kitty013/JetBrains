package com.company.doc;

public class ArithmeticOperations {

    public static void main(String[] args) {

        /** BINANRY ARITHMETIC OPERATIONS
         * The / operator returns the integer part of the divison of two integer
         * numbers, and any fractional part is discarded.
         * The % in Java is the modulus or remainder operator. It returns the
         * remainder of the division of two numbers. Note, that when the dividend
         * is less than the divisor, the quotient is zero and the remainder
         * equals the dividend.
         */
        System.out.println(13 + 25); // prints 38
        System.out.println(20 + 70); // prints 90

        System.out.println(70 - 30); // prints 40
        System.out.println(30 - 70); // prints -40

        System.out.println(21 * 3);  // prints 63
        System.out.println(20 * 10); // prints 200

        System.out.println(8 / 3);   // prints 2
        System.out.println(41 / 5);  // prints 8

        System.out.println(10 % 3);  // prints 1, because 10 divided by 3 leaves remainder of 1
        System.out.println(12 % 4);  // prints 0 because 12 divided by 4 leaves remainder of 0
        System.out.println(5 % 9);   // prints 5, because 5 divided by 9 leaves remainder of 5

        /** WRITING COMPLEX EXPRESSIONS
         *  The calculation order coincides with arithmetic rules. To specify the order
         *  of execution we can use parentheses as in the examples.
         */
        System.out.println(1 + 3 * 4 - 2);      // prints 11
        System.out.println((1 + 3) * (4 - 2));  // prints 8

        /** UNARY OPERATORS
         * The unary plus operator indicates a positive value. It's an optional operator.
         * The unary minus operator negates a value or an expression.
         * They both have a higher level of precedence than the multiplication and division operators.
         */
        System.out.println(+5);             // prints 5
        System.out.println(-8);             // prints -8
        System.out.println(-(100 + 4));     // prints -104

        /** THE PRECEDENCE ORDER
         *      parentheses
         *      unary plus/minus
         *      multiplication, division
         *      addition, substraction
         */

    }
}
