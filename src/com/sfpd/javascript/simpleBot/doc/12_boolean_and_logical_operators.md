# Boolean and logical operators

## 1. Boolean type
There are statements about which we can say whether they are true or not. These
statements have a special type - logical, or boolean. There are only two possible
variables: true or false.
```
    let bool = true;
    console.log(bool); // true
```

## 2. Logical operators
There are only three of them in JavaScript: logical *AND* (&&), logical *OR* (||), and
*NOT*(!). The first two operators are binary, which means that they're used with two
operators, and the ! operator is unary, so it takes one operand. && returns true if
both operands are true, and false in all other cases:
```
    console.log(true && true);   // true
    console.log(true && false);  // false
    console.log(false && true);  // false
    console.log(false && false); // false
```
|| returns false if both operands are false and true in all other cases:
```
    console.log(true || true);   // true
    console.log(true || false);  // true
    console.log(false || true);  // true
    console.log(false || false); // false
```
! returns false to true and true to false:
```
    console.log(!false);  // true
    console.log(!true);   // false
    console.log(!!true);  // true
```

## 3. More capabilities of logical operators in JS
Among the numerical values, O is considered false, and all other numbers are true.
All strings except the empty string are considered true.

Expressions are always calculated from left to right. && returns false as soon as
it finds the first occurring false, and the operator || returns true as soon as
it sees the first true:
```
    console.log(true || 0);      // true
    console.log(false && "sun"); // false
    console.log(1 || 0);         // 1
```

## 4. Priority
When working with complex expressions, you should take into account their priority.
The priority of ! is higher that that of &&, and the priority of && is higher than
that of ||. If you need to change the priority, use parentheses:
```
    console.log(!false && !true);   // false
    console.log(!(false && !true)); // true
```