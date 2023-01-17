# Null and undefined
## 1. Null
*Null* means that the variable was explicitly assigned an empty or non-existing value.
If the variable is *null*, we know that it does not contain an acceptable number,
string or other data type:
```
    let name = null;
    console.log(name); // null
```

## 2. Undefined
The *undefined* value is returned when a variable was declared, but its value wasn't
set.
```
    let count;
    console.log(count); // undefined
```
The *undefined* value is also returned when a function has a missing parameter:
```
    function getDetails(a) {
      console.log(a);
    }

    getDetails(); // undefined
```

## 3. Check the data types
null and undefined literally mean "no value", but they have different data types:
```
    console.log(typeof null);       // object
    console.log(typeof undefined);  // undefined
```
