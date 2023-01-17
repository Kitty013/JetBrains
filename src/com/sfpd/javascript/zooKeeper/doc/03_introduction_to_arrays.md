# Introduction to Arrays

## 1. What are Arrays?
*Arrays* are used to store multiple elements in a single variable. They are a special
type of object in JavaScript. (The typeof operator in JavaScript returns "object"
for Arrays.)

To resolve the issue described in the introduction, we can create an Array of
marks for each student so they can be stored in a single variable.
There's actually an even better way to organize the students' marks. You can use
a more efficient data structure called a *Map*, which you will learn about in a future
topic. 

Next, let's see how to declare Arrays.

## 2. Declaration of Arrays
In JavaScript, there are two ways to declare an Array:
```
    let marks = new Array(); // Method 1

    let marks = []; // Method 2
```
Method 2 is usually preferred over Method 1.

Now let's look at how the process of initializing *Arrays* differs when using these
two methods.

## 3. Initialization of Arrays
If the Array is declared using Method 2, it can be initialized in the following
way:
```
    // Method 2
    // Declaring and initializing the Array at the same time.
    let marksOne = [45, 50, 44, 30, 29] // Only integers
    let marksTwo = ["forty-five", "fifty", 44, 30, "twenty-nine"] // Strings and integers
```

Note that a single Array can contain elements of different data types.

Next, let's see how to initialize Arrays using Method 1:
```
    // Method 1
    // Declaring and initializing the Array at the same time.
    let marksOne = new Array(45, 50, 44, 30, 29); // Creates an Array of marks with five elements
    let marksTwo = new Array(5); // Creates an Array of five undefined elements
    let marksThree = new Array("45"); // Creates an Array containing one string element, which is "45"
```

As you can see, marksOne is an Array of five integers, and marksTwo is an Array
of five undefined elements. 

This syntax can be confusing, so it's best not to use Method 1 when working with numbers.
Fortunately, as shown, the same problem doesn't apply to strings — marksThree is an
Array containing the string "45".

If you declare an Array of undefined elements like this:
```
    let marks = new Array(5);
```
You can initialize them one by one:
```
    marks[0] = "forty-five";
    marks[1] = "fifty";
    marks[2] = 44;
    marks[3] = 30;
    marks[4] = "twenty-nine";
```

## 4. Index positions
You might be wondering about the numbers in brackets used after the variable name
in the above example: marks[0], marks[1], etc. This is the syntax for accessing
or assigning values to the individual elements in an Array using index positions.

*Array* indexes start from 0, so we can use the index numbers shown in the example
to access the first five elements of an Array.

Attempting to access an element with an index beyond the bounds of an Array will
return undefined. And the same will happen if you try to access an element within
an Array's bounds that hasn't been initialized.

Let's look at an example to help illustrate this point:
```
    let marks = [45, 50, 44, 30, 29];
    marks[10] = 65;
    console.log(marks);
```
We get this output because the number 65 was assigned to index position 10, which
is greater than the initial size of the Array. So, Array indexes 5, 6, 7, 8, and 9
remain empty as they haven't been initialized, and will return undefined if you
attempt to access them.

> Don't forget that [0] is the first element and [1] is the second element in an
> *Array*.

## 5. Length of an Array
An *Array's length property* returns the number of elements that it contains, as
shown in the below example:
```
    const languages = ["C", "C++", "Python", "Java", "JavaScript"];

    let len = languages.length; // 5

    const colors = ['orange', 'blue', 'red', 'pink', 'magenta'];
```
This *Array* has five elements. You already know that you can access the first one
using colors[0], the second with colors[1], and so on. 

But what if you want to get the last element of the Array and you don't know its length?
You can use the length property in this situation, as you can see below:
```
    const lastItem = colors[colors.length - 1]; // "magenta"
```
## 6. isArray()
The *isArray()* method returns true if an object is an Array, otherwise false.
The full syntax is Array.isArray(obj) .

The below examples show how to use this method:
```
    let marks = [45, 50, 44, 30, 29];
    Array.isArray(marks); // true

    let marksOne = "45";
    Array.isArray(marksOne); // false
```
