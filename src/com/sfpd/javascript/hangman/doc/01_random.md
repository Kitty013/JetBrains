# Random
In programming, you sometimes need to generate random numbers. They can be used to access a random array
element or in other instances where uncertainty is required. 

JavaScript has a special Math.random() method designed for these situations. Let's get a deeper
understanding of its use cases.

## 1. How to generate a random number?
*Math.random()* returns a random floating-point from 0 to 1 (the number is greater than or equal to 0,
but less than 1).

> This method is a part of the built-in Math object used for various mathematical operations.
 
Take a look at the examples below:
```
    console.log(Math.random()); // 0.5680051955123826 
    console.log(Math.random()); // 0.40357719118239643
```

But what if we need to generate larger random numbers, such as from 0 to 10? To solve the problem,
we can simply multiply the generated values by 10 or any other number which represents the maximum
value:
```
    console.log(Math.random() * 10); // 3.4828303272733097
    console.log(Math.random() * 25); // 24.893162695902227
```

## 2. Generating random integers
If we go even further and try to generate an **integer**, we will need to use another helpful method
from the *Math* object. *Math.floor()* **rounds** a number down to the nearest integer. So, if we
combine these two methods, we can write a function for our purposes:
```
    function getRandomInteger(value) {
        return Math.floor(Math.random() * value);
    }

    console.log(getRandomInteger(5)); // 3
    console.log(getRandomInteger(100)); // 42
```

## 3. Minimum and maximum values
The approach in the previous section only produces positive numbers starting from zero. Imagine a
situation where we need to have different **minimum** and **maximum** boundaries or even generate
negative values. At this point, we have enough knowledge to generalize these ideas and make a proper
random function.

To get numbers of any range, we need to pass two arguments representing the minimum and maximum possible
values to our function. You can see the function's code below with some examples of the generated values:

The below code snippet generates random numbers between two numbers:
```
    function getRandomInteger(min, max) {
        return (Math.random() * (max - min)) + min;
    }

    console.log(getRandomInteger(10, 20)); // 18.648405708980263
    console.log(getRandomInteger(-5, 2)); // 1.0816012391863188
```
The below code snippet generates random integers between two numbers:
```
    function getRandomInteger(min, max) {
        return Math.floor(Math.random() * (max - min)) + min;
    }

    console.log(getRandomInteger(10, 20)); // 10
    console.log(getRandomInteger(-5, 2)); // -3
```
The below code snippet generates random integers inclusive of the two given maximum and minimum values:
```
    function getRandomInteger(min, max){
        return Math.floor(Math.random() * (+max + 1 - +min)) + +min;
    }

    console.log(getRandomInteger(10, 20)); // 15
    console.log(getRandomInteger(-5, 2)); // -4
    console.log(getRandomInteger(10, 20)); // 20
    console.log(getRandomInteger(-5, 2)); // -5
```
In the above example, the *+max* and *+min* indicate that the maximum and minimum value should always be
positive and hence the above formula will work to generate a random integer inclusively of the two
provided maximum and minimum values.

## 4. Accessing a random array element
Now let's consider a practical problem. We have a list of rock songs, and the musicians need to decide
which one to play. Choosing the first song isn't an option. So, we need to select a random element from
the **array**.
```
    const songs = ["Stairway to Heaven", "Imagine", "Yesterday", "Light My Fire"];
```
To access an array element, we use its **index**. This can be represented as a random integer that is
less than the array's **length**. We already managed to produce random integers, so let's apply our
knowledge to the concept of an array:
```
    function getRandomElement(array) {
        let index = Math.floor(Math.random() * array.length);
        return array[index];
    }

    console.log(getRandomElement(songs)); // Imagine
    console.log(getRandomElement(songs)); // Stairway to Heaven
```

## 5. Conclusion
In this topic, you have learned how to generate a random number with the *Math.random()* method.
You've also discovered how to adjust a range of random numbers, so they fit between a minimum and
maximum possible value. What's more, you now know how to access a random array element, meaning you
can generate random items of various data types. Don't forget that you need to use another handy
function called *Math.floor()* if you want to convert the floating-point number produced by
*Math.random()* to an integer.
