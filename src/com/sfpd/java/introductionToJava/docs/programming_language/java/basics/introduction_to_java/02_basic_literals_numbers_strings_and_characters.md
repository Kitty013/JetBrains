# Basic Literals: numbers, strings and characters
Regardless of its complexity, a program always performs operations on numbers, 
strings, and other values. These values are called **literals**. There are many 
different sorts of literals in Java, but in this topic we will focus only on a 
few of them: the ones that surround us all the time in everyday life.

Consider literals as groceries. To use them, usually you need to store them somewhere.
Typically, they are stored in variables, which you can think of as containers designed
to hold a specific type of data.

Variables can only store matching data. You wouldn't want to accidentally put honey
in a cardboard cereal box or pour cereal into a salt shaker. To prevent such mistakes,
learn to distinguish between the basic literals: integer numbers, strings, and
characters.

## Integer numbers
You use these numbers to count things in the real world as natural numbers. Integer
numbers also include zero and negative ones. Here are several examples of valid 
integer number literals separated by commas: 0, 1, 2, 10, 11, -100.

Here is how integers can be used in code:
```
int numApples = 1000;
```
Reading code is crucial for anyone in IT, so let's parse it together. Here you put 
the integer 1000 into a variable of an **integer type**, called numApples. This is
similar to filling a container with its designated contents!

You can increase code readability by dividing the digit into blocks with **underscores**:
1_000_000 is more readable than 1000000. So let's pack our apples to make selling
them easier:
```
int numPackedApples = 1_000_000;
```
Fear not if these code snippets aren't 100% clear to you yet! They aim to help you 
develop the skill of code reading. Just grasp the overall meaning and follow your 
study plan, and you'll be writing your own code in no time!

## Characters
A character is a single symbol, denoted with single quotes. You can use character literals 
to represent single letters like 'A', 'x', digits from '0' to '9', whitespaces (' '), and 
other characters or symbols like '$'.

Be mindful of quotes and avoid confusing characters representing digits with the digits 
themselves:
```
char charOne = '1'
int numOne = 1
```
Fun fact: characters sit between integers and strings: they resemble strings, yet you can
do math with them.

## Strings
A string is a sequence of characters, encapsulated by double quotes. It represents text-based
information, such as an advertising line, a webpage address, or a website login name. Here are
some valid examples: "text", "I want to know Java", "123456", "e-mail@gmail.com". As you can 
see, a string can include letters, digits, whitespaces, and other charactes altogether.

A string consisting of a single character like "A" is also a valid string, but do not confuse 
it with the 'A' character. Note the difference in quotes!
```
char singleQuoted = 'A'
String doubleQuoted = "A"
```

## Conclusion
You have learned to distinguish between the following literals:
- 123 is an integer number, "123" is a string;
- 'A' is a character, "A" is a string;
- '1' is a character, 1 is an integer number.