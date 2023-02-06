# Programming style and documentation 
Good programming style and proper documentation make a program easy to read and help
programmers prevent errors.

## appropriate comments and comment styles
In addition to line comments (beginning with //) and block comments(beginning with /*),
javadoc comments begin with /** and end with /*.
Use javadoc comments for commenting an entire class or an entire method. For commenting
on steps inside a method, use line comments (//).

## proper indention an spacing
Indentation is used to illustrate the structural relationships between a program's
components or statements.
```
    public static void test() {
        // End-of-line style
        System.out.println("Block Styles");

        // Good Style
        System.out.println(3 + 4 * 4);

        // Bad Style
        System.out.println(3+4*4);
    }

    /* Next - line style
    public static void main(String[] args)
    {
        System.out.println("Block Styles");
    }
     */

}
```
