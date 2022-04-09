package com.company.doc;

public class BooleanAndLogicalOperations {
    /** BOOLEAN TYPE
     *  The boolean is a data type that has only two possible values: false and true.
     *  This is also known as the logical type.
     *  You cannot assign an integer value to a boolean variable. In java, 0 is not
     *  the same as false.
     */
    public static void main(String[] args) {
        boolean open = true;
        boolean closed = false;

        System.out.println(open);   // true
        System.out.println(closed); // false

    }
    /** LOGICAL OPERATORS
     *  Four logical operators:
     *      NOT unary operator that reverses the boolean value.                 !
     *      AND binary operator that returns true if both operands are true.    &&
     *      OR  binary operator that returns true if one operand is true        ||
     *      XOR binary operator that returns true if boolean operands have      ^
     *          different values
     */
    boolean f = false;  // f is false
    boolean t = !f;     // t is true

    boolean b1 = false && false;    // false
    boolean b2 = false && true;     // false
    boolean b3 = true && false;     // false
    boolean b4 = true && true;      // true

    boolean b5 = false || false;    // false
    boolean b6 = false || true;     // true
    boolean b7 = true || false;     // true
    boolean b8 = true || true;      // true

    boolean b9 = false ^ false;     // false
    boolean b10 = false ^ true;     // true
    boolean b11 = true ^ false;     // true
    boolean b12 = true ^ true;      // false

    /** THE PRECEDENCE OF LOGICAL OPERATORS
     *  The sorted order of decreasing their priorities:
     *      !   NOT
     *      ^   XOR
     *      &&  AND
     *      ||  OR
     *  To change the order you can use round brackets.
     */
    boolean b = true && !false;     // true, because !false

    boolean cold = false;
    boolean dry = true;
    boolean summer = false; // suppose it's autumn

    boolean trekking = dry && (!cold || summer); // true, let's go trek!

    /** SHORT-CIRCUITING EVALUATION
     *  false && ... => false
     *  true || ... => true
     */

}
