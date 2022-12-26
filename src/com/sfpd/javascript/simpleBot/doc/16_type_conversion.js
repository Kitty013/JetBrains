/**
$1. String conversion
    String conversion occurs when you want to represent something as a string. The
    string() function must be applied to explicitly cast a value to a string.
**/
    String(123);   // "123"
    String(false); // "false"
    String(-12.3); // "-12.3"
    String(true);  // "true"

 // In JS, the implicit conversion will be called by the binary + operator when one
 // of the operands is a string:
    "3" + 4                        // "34"
    4 + ""                         // "4"
    true + "detective"             // "truedetective"
    "You are " + 25 + " years old" // "You are 25 years old"

 // Remember the order of arithmetic operations. If there are several numbers before
 // the string, these numbers will be added before the conversion:
    3 + 10 + "1" // "131", not "3101"

/**
$2. Numeric conversion
    Numeric conversion occurs when you want to represent something as a number. To
    perform an explicit conversion, apply the Number() function:
**/
    Number("1");    // 1
    Number(" 37 "); // 37
    Number("");     // 0
    Number("\n3");  // 3
    Number("\n");   // 0
    Number("\t");   // 0
    Number(true);   // 1
    Number(false);  // 0
    Number("apple"); // NaN (Not A Number)

 // When converting a string to be a number, spaces and \n and \t characters at the
 // beginning and the end of the string are cut off. If the string turns out to be
 // empty, the result will return 0. The boolean type behaves as expected: false
 // turns into 0 and true into 1.
    true + 43 // 44
    3 - false // 3
    10 / "5"  // 2
    -true     // -1
    +"85"     // 85


/**
$3. Boolean conversion
    Boolean conversion occurs when you want to represent something as a boolean. To
    explicitly convert data into a boolean value, the Boolean() function should be
    applied:
**/
    Boolean(1);            // true
    Boolean(0);            // false
    Boolean("Am I nice?"); // true
    Boolean("");           // false

 // The rules for using this function are simple. The following value give the false
 // value as the result of conversion: false, undefined, null, 0, NaN and "". The
 // conversion of all other values will give the true value.

 // Implicit conversion occurs when using logical operators (||, && and !):
    !!3                      // true
    0 || "go"                // "go"
    "Master" && "Margarita"  // "Margarita"

 // Implicit conversion with || and && operators occurs under the hood and eventually
 // returns the original value of one of the operands.
