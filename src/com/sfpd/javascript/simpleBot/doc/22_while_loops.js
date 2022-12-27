/**
$1. While syntax
    The while loop has following syntax:
**/
    while (condition) {
    ...
    };

//  It runs while the condition == true. Once the value in parentheses becomes false,
//  the loop terminates. Look at the following example:
    let n = 2;
    while (n < 100) {
        n = n * n;
        console.log(n);
    };

/**
$2. Do...while syntax
    There is another kind of loop which runs while the conditions are true: it is
    called the do...while loop. It has the following syntax:
**/
    do {
    ...
    } while (condition);

//  The example above can be rewritten using the do...while construction:
    let n = 2;
    do {
        n = n * n;
        console.log(n);
    } while (n < 100);

/**
$3. While Vs do...while loops
    In case of do...while, the condition is checked after entering the loop and
    running the first iteration. This guarantees the loop runs at least once, even if
    the condition is false from the beginning.
**/