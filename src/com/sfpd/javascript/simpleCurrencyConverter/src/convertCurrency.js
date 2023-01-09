/**
    $1. Description
    In this stage, we will start converting a provided amount of USD to the list of
    currencies in the first stage.
    First, print a message to let users know what the program can do:
            I can convert USD to these currencies: JPY, EUR, RUB, USD, GBP
            Type the currency you wish to convert: USD

    Get input from users like in the example. Calculate and output the result that
    must take 4 decimal places.
    To simplify getting input from the console, we're using a JS library, check out
    the documentation to see how it's used.
    Don’t forget that when getting the input for the desired currency, the program
    should be able to process lower and uppercase letters. Also, if an unknown input
    is provided by users, print the following message and stop the program:
    Unknown currency.
    The value for the converted amount should not be less than 1. If it's less,
    output The amount cannot be less than 1. If the amount is not a number, output
    The amount has to be a number.

    $2. Objectives
    In this stage, your program should:
        - Output a new message about what it can do;
        - Ask for the currency and amount (see Examples);
        - Calculate and output the correct result;
        - Handle any uppercased or lowercased inputs;
        - Handle unknown currency input;
        - Handle an amount that is less than 1;

    $3. Examples
    The greater-than symbol followed by a space (> ) represents the user input.
    Note that it's not part of the input.

    Example 1: converting to JPY

    Welcome to Currency Converter!
    1 USD equals 1 USD
    1 USD equals 113.5 JPY
    1 USD equals 0.89 EUR
    1 USD equals 74.36 RUB
    1 USD equals 0.75 GBP
    I can convert USD to these currencies: JPY, EUR, RUB, USD, GBP
    Type the currency you wish to convert: USD
    To: > JPY
    Amount: > 1
    Result: 1 USD equals 113.5000 JPY
    Example 2: converting to EUR

    Welcome to Currency Converter!
    1 USD equals 1 USD
    1 USD equals 113.5 JPY
    1 USD equals 0.89 EUR
    1 USD equals 74.36 RUB
    1 USD equals 0.75 GBP
    I can convert USD to these currencies: JPY, EUR, RUB, USD, GBP
    Type the currency you wish to convert: USD
    To: > EUR
    Amount: > 18
    Result: 18 USD equals 16.0200 EUR
    Example 3: unknown currency

    Welcome to Currency Converter!
    1 USD equals 1 USD
    1 USD equals 113.5 JPY
    1 USD equals 0.89 EUR
    1 USD equals 74.36 RUB
    1 USD equals 0.75 GBP
    I can convert USD to these currencies: JPY, EUR, RUB, USD, GBP
    Type the currency you wish to convert: USD
    To: > TL
    Unknown currency
    Example 4: wrong amount

    Welcome to Currency Converter!
    1 USD equals 1 USD
    1 USD equals 113.5 JPY
    1 USD equals 0.89 EUR
    1 USD equals 74.36 RUB
    1 USD equals 0.75 GBP
    I can convert USD to these currencies: JPY, EUR, RUB, USD, GBP
    Type the currency you wish to convert: USD
    To: > USD
    Amount: > -1
    The amount cannot be less than 1
    Example 5: wrong amount

    Welcome to Currency Converter!
    1 USD equals 1 USD
    1 USD equals 113.5 JPY
    1 USD equals 0.89 EUR
    1 USD equals 74.36 RUB
    1 USD equals 0.75 GBP
    I can convert USD to these currencies: JPY, EUR, RUB, USD, GBP
    Type the currency you wish to convert: USD
    To: > USD
    Amount: > a
    The amount has to be a number
    Example 6: lowercase handling

    Welcome to Currency Converter!
    1 USD equals 1 USD
    1 USD equals 113.5 JPY
    1 USD equals 0.89 EUR
    1 USD equals 74.36 RUB
    1 USD equals 0.75 GBP
    I can convert USD to these currencies: JPY, EUR, RUB, USD, GBP
    Type the currency you wish to convert: USD
    To: > jpy
    Amount: > 3
    Result: 3 USD equals 340.5000 JPY
**/

//const input = require('sync-input');
let list = [
    {
        currency: "USD",
        amount: 1
    },
    {   
        currency: "JPY",
        amount: 113.5
    },
    {
        currency: "EUR",
        amount: 0.89
    },
    {
        currency: "RUB",
        amount: 74.36
    },
    {
        currency: "GBP",
        amount: 0.75
    }
];

function welcome() {
    console.log("Welcome to Currency Converter!");
};

welcome();

for ( const obj of list) {
    console.log("1 USD equals "+ obj.amount + " " + obj.currency);
};

console.log("I can convert USD to these currencies: JPY, EUR, RUB, USD, GBP");
console.log("Type the currency you wish to convert: USD");

let promptCurrency = String(prompt("To: ")).toUpperCase();
console.log("To: " + promptCurrency);
let check = (list.find(obj => obj.currency.toString() === promptCurrency));

if(check === undefined) {
   console.log("Unknown currency");
} else {
  let promptAmount = Number(prompt("Amount: "));
  console.log("Amount: " + promptAmount);
  if (Number.isNaN(promptAmount)) {
     console.log("The amount has to be a number");  
  } else if (Number.isInteger(promptAmount) && promptAmount < 1) {
     console.log("The amount can not be less than 1");
  } else {
     displayResult(promptCurrency, promptAmount);
     };
 };

function displayResult(promptCurrency, promptAmount) {
    let conAmount = (check.amount * promptAmount).toFixed(4);
    let result = `Result: ${promptAmount} ${list[0].currency} equals ${conAmount} ${promptCurrency}`;
    console.log(result);
};


// const input = require('sync-input');
// let currencyList = ["1 USD", "113.5 JPY", "0.89 EUR", "74.36 RUB", "0.75 GBP"];
// let list = ["USD", "JPY", "EUR", "RUB", "GBP"];
// let currencyAmount = [1 , 113.5, 0.89, 74.36, 0.75];
// let length = currencyList.length;
// let count = 0;

// function welcome() {
//     console.log("Welcome to Currency Converter!");
// };

// welcome();

// do {
//     console.log(`1 USD equals ${currencyList[count]}`);
//     count++;
// } while (count <= length -1);

// console.log("I can convert USD to these currencies: JPY, EUR, RUB, USD, GBP");
// console.log("Type the currency you wish to convert: USD");

// let promptCurrency = String(input("To: ")).toUpperCase();
// let checkCurrency = list.includes(promptCurrency);

// if(checkCurrency == false) {
//     console.log("Unknown currency");
// } else {
//     let promptAmount = Number(input("Amount: "));

//     if (typeof(promptAmount) !== "number" || typeof(promptAmount) === "NaN") {
//         console.log("The amount has to be a number");
//     } else if (promptAmount < 1) {
//         console.log("The amount cannot be less than 1");
//     } else {
//         calculate(promptCurrency, promptAmount);
//     };
// };

// function calculate(promptCurrency, promptAmount) {
//     let conAmount;
//     switch (promptCurrency) {
//         case "USD":
//             conAmount = (currencyAmount[0] * promptAmount).toFixed(4);
//             console.log(`Result: ${promptAmount} ${list[0]} equals ${conAmount} ${promptCurrency}`);
//             break;
//         case "JPY":
//             conAmount = (currencyAmount[1] * promptAmount).toFixed(4);
//             console.log(`Result: ${promptAmount} ${list[0]} equals ${conAmount} ${promptCurrency}`);
//             break;
//         case "EUR":
//             conAmount = (currencyAmount[2] * promptAmount).toFixed(4);
//             console.log(`Result: ${promptAmount} ${list[0]} equals ${conAmount} ${promptCurrency}`);
//             break;
//         case "RUB":
//             conAmount = (currencyAmount[3] * promptAmount).toFixed(4);
//             console.log(`Result: ${promptAmount} ${list[0]} equals ${conAmount} ${promptCurrency}`);
//             break;
//         case "GBP":
//             conAmount = (currencyAmount[4] * promptAmount).toFixed(4);
//             console.log(`Result: ${promptAmount} ${list[0]} equals ${conAmount} ${promptCurrency}`);
//             break;
//     };
// };
