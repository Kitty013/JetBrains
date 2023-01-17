# Increment and decrement
## 1. Using ++ and -- in JavaScript
JavaScript has two opposite operations called *increment* (++) and *decrement* (--)
to increase or decrease the value of a variable by one, respectively. For example:
```
    let a = 10;
    let b = 10;
    console.log(++a); // 11
    console.log(--b); // 9
```
The code above gives the same result als the code below:
```
     let a = 10;
     let b = 10;
     console.log(a + 1); // 11
     console.log(b - 1); // 9
```

## 2. Prefix increment
Both *increment* and *decrement* operators have two forms that are very important
when using the result in the current statement:
   - *prefix* (++n or --n) increases/decreases the value of a variable before it is used;
   - *postfix* (n++ or n--) increases/decreases the value of a variable after it is used.

Let's look at the **prefix** increment:
```
    let a = 4;
    let b = ++a;

    console.log(a); // 5
    console.log(b); // 5
```

## 3. Postfix increment
*Postfix* increment increases or decreases the value of a variable after it is used.
Consider an example:
```
    let a = 4;
    let b = a++;

    console.log(a); // 5
    console.log(b); // 4
```
The **Postfix** operator first returns the value of a and only then the variable a
is incremented.

That's why when we assign a++ to b, we actually assign 4 to b, only then a will
be incremented. So, b is 4 and a is 5.

If that's still not clear enough for you, take a look at the code:
```
    let a = 4;
    console.log(a++ - a); // -1

    let sum = --a + --b + --c;

    int result = 5;
    int a = 1;
    int b = --a; // 0
    a++; // 2
    result += a + (--a / ++b);
    console.log(result); // 6
    // 5 + 1 + (0/1)= 6 => 0/1 = 0
```