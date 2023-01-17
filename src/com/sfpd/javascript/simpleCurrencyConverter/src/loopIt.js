/** 1. Description
 In the final stage, we will loop our program to make it run continuously until the exit command is prompted.
 First, ask the user what they want to do: What do you want to do?
 Give two choices to users: one is conversion, the other is the exit.
 Users need to input 1 and 2, respectively: 1-Convert currencies 2-Exit program
 In case of any wrong input, you need to ask again for the input and repeat the process.
 Print the following message when users choose to exit the program: Have a nice day!
 Print the following message when unknown input occurs: Unknown input

 2. Objectives
 In this stage, your program should:

 Continuously ask for new currency input;
 Give two choices to users;
 Handle unknown inputs.

 3. Examples
 Example 1: USD to JPY

 Welcome to Currency Converter!
 1 USD equals 1 USD
 1 USD equals 113.5 JPY
 1 USD equals 0.89 EUR
 1 USD equals 74.36 RUB
 1 USD equals 0.75 GBP
 What do you want to do?
 1-Convert currencies 2-Exit program
 > 1
 What do you want to convert?
 From: > USD
 To: > JPY
 Amount: > 115
 Result: 115 USD equals 13052.5000 JPY
 What do you want to do?
 1-Convert currencies 2-Exit program
 Example 2: unknown currency

 Welcome to Currency Converter!
 1 USD equals 1 USD
 1 USD equals 113.5 JPY
 1 USD equals 0.89 EUR
 1 USD equals 74.36 RUB
 1 USD equals 0.75 GBP
 What do you want to do?
 1-Convert currencies 2-Exit program
 > 1
 What do you want to convert?
 From: > TL
 Unknown currency
 What do you want to convert?
 From:
 Example 3: exiting the program

 Welcome to Currency Converter!
 1 USD equals 1 USD
 1 USD equals 113.5 JPY
 1 USD equals 0.89 EUR
 1 USD equals 74.36 RUB
 1 USD equals 0.75 GBP
 What do you want to do?
 1-Convert currencies 2-Exit program
 > 2
 Have a nice day!
 Example 4: unknown input

 Welcome to Currency Converter!
 1 USD equals 1 USD
 1 USD equals 113.5 JPY
 1 USD equals 0.89 EUR
 1 USD equals 74.36 RUB
 1 USD equals 0.75 GBP
 What do you want to do?
 1-Convert currencies 2-Exit program
 > a
 Unknown input
 What do you want to do?
 1-Convert currencies 2-Exit program
 **/

const input = require('sync-input');
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

let userChoice;
let isValidChoice = false;
let amount;
let isAmountValid;
let exchangeRate;
let fromCurrency;
let toCurrency;
let result;
let resultMessage;
let currency;
let isCurrencyValid;

console.log("Welcome to Currency Converter!");

for (const obj of list) {
    console.log("1 USD equals " + obj.amount + " " + obj.currency);
}

console.log("What do you want to do?");

do {
    checkChoice();
    switch (userChoice) {
        case 2:
            console.log("Have a nice day!");
            break;
        case 1:
            console.log("What do you want to convert?");
            fromCurrency = convertCurrency('From:');
            exchangeRate = (1 / list.find(obj => obj.currency === fromCurrency).amount);
            toCurrency = convertCurrency('To:');
            amount = convertAmount();
            resultMessage = displayResult(toCurrency, amount, exchangeRate, fromCurrency);
            console.log(resultMessage);
        //checkChoice();
    }
} while (!isValidChoice)

function checkChoice() {
    userChoice = Number(input("1-Convert currencies 2-Exit program\n"));
    isValidChoice = userChoice === 1 || userChoice === 2;
    if (!isValidChoice) {
        console.log("Unknown input");
    }
    return userChoice;
}

function convertCurrency(message) {
    do {
        currency = String(input(`${message}`)).toUpperCase();
        isCurrencyValid = (list.find(obj => obj.currency === currency));
        if (!isCurrencyValid) {
            console.log("Unknown currency");
        }
    } while (!isCurrencyValid)
    return currency;
}

function convertAmount() {
    do {
        amount = Number(input("Amount:"));
        isAmountValid = Number.isInteger(amount);
        if(!isAmountValid) {
            console.log("The amount has to be a number");
        }
        if (isAmountValid && amount < 1) {
            console.log("The amount cannot be less than 1");
        }
    } while (!isAmountValid || isAmountValid && amount < 1)
    return amount;
}

function displayResult(toCurrency, amount, exchangeRate, fromCurrency) {
    result = ((list.find(obj => obj.currency === toCurrency).amount * amount) * exchangeRate).toFixed(4);
    resultMessage = (`Result: ${amount} ${fromCurrency} equals ${result} ${toCurrency}`);
    return resultMessage;
}