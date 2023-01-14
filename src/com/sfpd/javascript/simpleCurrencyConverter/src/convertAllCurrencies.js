/**
$1. Description
    In this stage, we need to adjust our program to start converting all currencies
    between themselves.
    First, remove the previous message:
        I can convert USD to these currencies: JPY, EUR, RUB, USD, GBP
        Type the currency you wish to convert: USD
    Then, output the following message: What do you want to convert? After this,
    users provide input that indicates a currency to convert from. Don't forget to
    handle all unknown and invalid inputs like in the previous stage.

$2. Objectives
    In this stage, your program should:
        Ask for the currencies (see Examples);
        Calculate and output the result;
        Handle any unknown and incorrect inputs.

$3. Examples
    The greater-than symbol followed by a space (> ) represents the user input.
    Note that it's not part of the input.

    Example 1: EUR to GBP

    Welcome to Currency Converter!
    1 USD equals 1 USD
    1 USD equals 113.5 JPY
    1 USD equals 0.89 EUR  1 usd = 0,9302 eur => 1 eur = 1,07  exchange rate = 1/0,9302 = 1,07
    1 USD equals 74.36 RUB
    1 USD equals 0.75 GBP
    What do you want to convert?
    From: > EUR
    To: > GBP
    Amount: > 115
    Result: 115 EUR equals 96.9101 GBP
    Example 2: wrong input

    Welcome to Currency Converter!
    1 USD equals 1 USD
    1 USD equals 113.5 JPY
    1 USD equals 0.89 EUR
    1 USD equals 74.36 RUB
    1 USD equals 0.75 GBP
    What do you want to convert?
    From: > USD
    To: > This is a currency, believe me!
    Unknown currency
    Example 3: JPY to JPY

    Welcome to Currency Converter!
    1 USD equals 1 USD
    1 USD equals 113.5 JPY
    1 USD equals 0.89 EUR
    1 USD equals 74.36 RUB
    1 USD equals 0.75 GBP
    What do you want to convert?
    From: > jpy
    To: > jpy
    Amount: > 3
    Result: 3 JPY equals 3.0000 JPY

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

welcome();

for ( const obj of list) {
   console.log("1 USD equals "+ obj.amount + " " + obj.currency);
};

console.log("What do you want to convert?");

let fromCurrency = String(prompt("From: ")).toUpperCase();
let checkFromCurrency = (list.find(obj => obj.currency.toString() === fromCurrency));

switch (checkFromCurrency) {
    case undefined:
        console.log("Unknown currency");
        break;
    default:
        let exchangeRate = (1/checkFromCurrency.amount);
        let toCurrency = String(prompt("To: ")).toUpperCase();
        let checkToCurrency = (list.find(obj => obj.currency.toString() === toCurrency));
        switch (checkToCurrency) {
            case undefined:
                console.log("Unknown currency");
                break;
            default:
                 let promptAmount = Number(prompt("Amount: "));
                 askForAmount(promptAmount, checkToCurrency, exchangeRate, fromCurrency, toCurrency);
                 break;
        };
};

function welcome() {
    console.log("Welcome to Currency Converter!");
};

function askForAmount(promptAmount, checkToCurrency, exchangeRate, fromCurrency, toCurrency) {
  if (Number.isNaN(promptAmount)) {
     console.log("The amount has to be a number");
  } else if (Number.isInteger(promptAmount) && promptAmount < 1) {
     console.log("The amount cannot be less than 1");
  } else {
      let conAmount = ((checkToCurrency.amount * promptAmount) * exchangeRate).toFixed(4);
      let result = `Result: ${promptAmount} ${fromCurrency} equals ${conAmount} ${toCurrency}`;
      console.log(result);
     };
};

