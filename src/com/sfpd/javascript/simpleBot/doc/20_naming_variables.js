/**
$1. Restrictions
    There are no specific requirements for characters that can be used in JavaScript to
    create names. However, there are two restrictions that you can easily remember: a
    name can only consist of letters, numbers and symbols _, $; and it shouldn't start
    with a digit.
**/
   let $testName; // right
   let testName;  // right
   let test_name; // right
   let test18;    // right
   let test;      // right

   let 18test;    // wrong
   let test-name; // wrong

// A hypen - is not a valid character for variable names is JS.

/**
$2. Reserved names
    Reserved names cannot be used when selecting a variable name. These are words that
    already perform specific functions in JavaScript. These words include: let, const,
    return, and function.
**/
    let const = 5;          // error
    let return = "apple";   // error

/**
$3. Naming conventions for variables
    In addition, there are the following conventions for naming variables:
    - the variable name must be readable, descriptive, and it should explain to the
      reader what sort of values it stores. For example:
**/
    let count;  // good name
    let n;      // bad name

/**
    Despite the validity of the underscore _ symbol, most style guides recommend
    opting for camelCase to write a name consisting of several words. camelCase is
    a way of writing phrases where each new word in the middle of the phrase begins
    with a capital letter, without intermediate spaces or punctuation marks:
**/
    let serverMessage; // the variable name is written according to camelCase practice

