# Introduction to objects
## 1. Not everything in JS in an object
An *object* is a non-primitive data type that represents an unordered collection of
properties. A property is a part of the object that imitates a variable. It consists
of a *key* and a *value* separated by a colon. The key can only be a string or Symbol
(data type, which we will get acquainted with later), but the value may be of any
data type. You can create empty objects without a single property:
```
    let book = {};
```
There is an alternative way to create an empty object, but it is rarely used in practice:
``` 
   let book = new Object();
```
You can check that both of these methods create an object using the typeof operator
that you already know.
```
    let book1 = {};
    let book2 = new Object();

    console.log(typeof book1); // object
    console.log(typeof book2); // object
```
If you want to create an object with several properties, all but the last one must
 be followed by a comma. To understand the syntax better, take a look at the example
```
    let country = {
      name: "Netherlands",
      population: 17.18
    };
```

## 2. Properties
There is an opportunity to refer to the properties. To access the properties, we
use a record with the object name and a dot. Let's use the previous code sample and
try to access the name property:
```
    console.log(country.name); // Netherlands
```
Properties can also be added using the dot symbol and the = assignment symbol. Let's
add to our object a property with the key capital and the value "Amsterdam":
```
    country.capital = "Amsterdam";
```
To delete a property, we can use the delete operator and a dot. This is how
removing the population property for an object named country will look like:
```
    delete country.population;
```
