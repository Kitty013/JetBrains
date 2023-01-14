# Builtin JS Functions
You should already know what a *function* is. Our imagination is unlimited, we can create any
functions required in our project. However, in many programming languages, there are
**built-in functions** that are needed everywhere. In this topic, we will study the examples
of such functions.

## 1. isNan()
You should remember that there is *NaN* (Not-a-Number) value in JavaScript because arithmetic
operations should not stop the program by design. How can we get *NaN* in our code? Take a
look at the examples of expressions that return *NaN*:
```
    //all return NaN
        5 * 'word'
        0 * Infinity
        Math.sqrt(-1)
```
You can see that all expressions should return something strange, and it is *NaN*. Since any
value must belong to some data type, it's a fun fact that *NaN* type is actually *number*.

Let's find out what the *isNan()* function is for. Consider that to work out some block of code,
we need to check that the value of some variable is NaN. How should we do it? Here's what
comes to mind first:
```
        let x = NaN
        if (x == NaN) {
            console.log('It works!')
        }
```
But it will not work! The result of the expression *NaN == NaN* is defined by the JavaScript
language specification (ECMAScript specification). According to it, if one of the elements
in the comparison expression is *NaN*, then *false* will be returned, even if the expression
is *NaN == NaN*. That is why, if you want to check if a value is *NaN*, then you should use
the *isNaN()* function.
```
        let x = NaN
        if (isNaN(x)) {
            console.log('It works!') //It will work
        }
```
As you can see, this function is built-in because we didn't declare it.

## 2. isFinite()
It's worth starting with the fact that *NaN* is not the only special value. You have to
remember two more values, *Infinity* and *-Infinity*, which are also of the *number* type. Let's
take a look at when they can appear in a program.
```
        1 / 0 //return Infinity
        -5 / 0 //return -Infinity
```
The name of the *isFinite()* function probably speaks for itself. This function checks whether
the value of a variable or the result of an expression is a finite number. It returns *true*
if the expression is finite and *false* if the value of the variable is *NaN*. Let's study an
example:
```
        if (isFinite(1 / 0)) {
            console.log('It is finite!')
        } else {
            console.log('It is not finite!!!') //it will log
        }
```
Of course, a number that is divisible by zero gives *Infinity*, so it is not a finite number,
and it will be output in the else block.

## 3. parseFloat()
Let's consider one more function, *parseFloat()*. It takes a string as an argument and returns
a floating point number if it is on the left, or *NaN* if the first character of the string is
not a number. Consider the following simple example:
```
        console.log(parseFloat("4.121323Hello"))
        console.log(parseFloat("Hello4.121323"))
        console.log(parseFloat("Good morning!"))
```
The following values will be output to the console:
```
        4.121323
        NaN
        NaN
```
This is another example where the result of a function can be *NaN*. The function works in the
first case, because the number is on the left, and the function discards the right part
with letters. Otherwise, the first character of the string is not a number, so the function 
immediately returns *NaN*.

## 4. parseInt()
This function is very similar to the previous one, the difference is that it takes a string
as the first argument and a radix as the second argument. The second argument is optional,
but note that the radix is not always the default number 10! Let's look at the following 
example:
```
        console.log(parseInt('451Something', 10)) // 451
        console.log(parseInt('451Something', 8)) // 297
        console.log(parseInt('25FA3Something', 16)) //155555
        console.log(parseInt('Something', 4)) //NaN
```
This function receives a string, which will be parsed according to the same rules as for
*parseFloat()* and radix. But the given number will be considered represented in the radix
calculus system, and such a number will be returned to the decimal calculus system.

>In some number systems, letters are considered part of the number. It is also worth
remembering that the function can return NaN if the number obtained from the string
cannot exist in the number system with radix.

## 5. Conclusion
In this topic, you've examined various built-in functions that can be very useful if you use
them wisely and follow all precautions so as not to get bugs. You've also learned about the
special *NaN*, *Infinity*, and *-Infinity* values, repeated the expressions that generate these
values. An important fact here is that the three characters are considered to be of the
number type.
