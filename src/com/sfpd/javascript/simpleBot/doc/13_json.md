# JSON
## 1. Basis syntax and structure
*JSON* text can be built on one of two structures:
- a collection of key:value pairs (associative array);
- an orderly set of values (array or list).

*JSON* objects are written in curly braces {}, and their key:value pares are separated 
by commas. The key and the value in the pair are separated by a colon :.
```
    {
        "first_name": "Sophie",
        "last_name": "Goodwin",
        "age": 34
    }
```
Arrays are written in square brackets [] and their values are separated by commas ,.
The value in the array, again, can be of any type, including another array or object.
```
    ["night", "street", false, [ 345, 23, 8, "juice"], "fruit"]
```

## 2. Nested objects
You can nest objects inside other objects as properties.
```
    {
      "persons": [
        {
          "firstName": "Whitney",
          "lastName": "Byrd",
          "age": 20
        },
        {
          "firstName": "Eugene",
          "lastName": "Lang",
          "age": 26
        },
        {
          "firstName": "Sophie",
          "lastName": "Goodwin",
          "age": 34
        }
      ]
    }
```

## 3. camelCase VS snake_case
*CamelCase* is a style where compound words are written together and without spaces,
but each word inside the phrase starts with a capital letter. The style is called
*camelCase* because the capital letters inside the word resemble camel's humps.
In *snake_case style*, compound words are written through the bottom underline.

## 4. The advantages of JSON
- compactness
- flexibility
- high readability
- most programming languages have functions and libraries for reading and
  creating JSON structures

