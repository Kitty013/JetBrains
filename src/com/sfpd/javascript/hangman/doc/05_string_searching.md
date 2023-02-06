# String searching
Strings in Javascript are as important and useful as, well, anything. It's not enough
though to just know how to create them. There are a lot more ways of using them and
definitely more operations that can be performed with a single string than you could
imagine. In this topic, we'll take a look at all the ways of searching for something 
inside of a string. Fasten your seatbelt!

## 1. Addressing a character
In some ways, strings behave like **arrays**. For example, inside of a string, each symbol
has its own **index** ? starting with 0, ending with the **length of the string** ? 1.
That means it's possible to get a symbol from a certain position in the string, and
there are two ways to do that.

The first one is to pretend, that our string is an array and do the following:
```
    let mystring = 'Sample text';
    console.log(mystring[0]); // S
```
But there is also a *charAt(index)* method, where the index parameter is the index of
the symbol you want to get. Here's how it works:
```
    let mystring = 'Sample text';
    console.log(mystring.charAt(0)); // S
```
No wonder that you'll get an 'S' symbol logged in the console as a result. It's as
easy as that!

Note, that if the index you pass to the method is out of bounds, an error is not 
gonna be thrown. Almighty Javascript will just return an empty string. It works both
for indices that are too big and for negative indices.

Also if you don't pass anything to the method, it will use a default value, which
is 0. So in this case you'll get the first symbol of the string:
```
let mystring = 'Sample text';
console.log(mystring.charAt()); // S
console.log(mystring.charAt(-1)); // Empty string
console.log(mystring.charAt(1000)); // Empty string
```
So, why do we need this method after all if we can just use square brackets? Because
if you try to address an item with an index out of bounds, you'll get undefined, while
charAt method is gonna give you an empty string. This difference is not huge, but
sometimes that's all that matters.

## 2. What does this string end with?
Next on the list are *endsWith()* and *startsWith()* methods. Let's use a real-life
example this time.

Imagine you need to count how many users signed up on the website with gmail.com, 
yahoo.com, and hotmail.com addresses. The first thing that comes to mind is to
address several characters from the end of the string and then compare them to
'gmail.com' and others. But this is not the best way to do it for obvious reasons.

Instead, you should use *endsWith()* method, which allows you to check whether the
string ends with a certain substring or not. This method is considered a logical
expression, so as a result it will return either true or false:
```
    let user_emails = ['hyperskill@gmail.com', 'jetbrains@yahoo.com'];
    let gmail_count = 0;

    user_emails.forEach(function(item) {
        if (item.endsWith('gmail.com')) {
            gmail_count = gmail_count + 1;
        }
    });

    console.log(gmail_count); // 1
```
The *startsWith()* method works just the same, returning true if the string starts
with a certain substring, and false if it doesn't:
```
    let user_email = 'hyperskill@gmail.com';

    let result = user_email.startsWith('hyperskill');

    console.log(result); // true
```
> Note, that this method is case-sensitive. Uppercase letters and the same lowercase
> letters are considered two different letters.

## 3. Finding out if there is a substring
Now we know how to check if a string **starts** or **ends** with a certain substring,
but what if we want to know if a string just includes a substring, not necessarily
in the beginning or in the end? For this case Javascript has *includes()* method,
which is also considered a logical expression and returns true if there is such a
substring, or false if there's not:
```
    let mystring = 'Sample text';

    let result = mystring.includes('Sample');

    console.log(result); // true
```
The way this method works is obvious, but what's interesting about it is that it
accepts another argument: the position at which to begin searching for a substring.
```
    let mystring = 'Sample text';

    let result = mystring.includes('Sample', 5);

    console.log(result); // false
```

## 4. Finding the index of a string
Slowly but surely we are getting to the last couple of methods, which are *indexOf()*
and *lastIndexOf()*. The first one allows you not only to find out if there is a
certain substring inside the string but also to get its **location** as an index of
its first character within the string. Here's a quick example:
```
    let mystring = 'Sample text';
    console.log(mystring.indexOf('text')); // 7
```
Here it's also possible to define a position within the string which you want to
start searching from:
```
    et mystring = 'text text text';
    console.log(mystring.indexOf('text', 2)); // 5
```
In this example, the first word will be ignored since the starting point is at the
third symbol (index of 2). As you can see from this example, the method returns an
index of the **first** symbol of the **very first substring**, so no matter how many
times the substring occurs in the string, the method will only give you an index of
its first appearance.

The *lastIndexOf()* method works similarly. As it's obvious from its name, it will
return an index of the first symbol from the last substring appearance:
```
    let mystring = 'text text text';
    console.log(mystring.lastIndexOf('text')); // 10
```
In case the values are not found within a string, both methods will return -1.
```
    let mystring = 'text text text';
    console.log(mystring.indexOf('abc', 2)); // -1
    console.log(mystring.lastIndexOf('abc', 2)); // -1
```

## 5. Summary
Strings are a very powerful tool, and now you know how to control this power. All
of the methods we've studied are pretty simple and logical, the only tricky thing
is that almost all of them are case-sensitive, so don't forget about that! And
remember that this is far from everything you can learn about strings. More things
to come in the following topics!
