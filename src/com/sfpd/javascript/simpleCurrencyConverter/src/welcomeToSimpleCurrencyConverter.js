/**
$1. Description
    To start things off, you need to print a message to greet your users:
        Welcome to Currency Converter!

    The next thing you need to do is print the list of currencies that the
    program can convert. For now, show the currencies and their equivalents
    in USD:
                Exchange    rates
                USD     	1.0
                JPY     	113.5
                EUR     	0.89
                RUB     	74.36
                GBP	        0.75

    The rates can fluctuate over time; for this project, use the list above
    throughout all stages.

$2. Objectives
    In this stage, your program should output:
            A welcome message;
            A list of currencies and their rates.

$3. Example
    The greater-than symbol followed by a space (> ) represents the user input.
    Note that it's not part of the input.
    Example 1:
            Welcome to Currency Converter!
            1 USD equals 1 USD
            1 USD equals 113.5 JPY
            1 USD equals 0.89 EUR
            1 USD equals 74.36 RUB
            1 USD equals 0.75 GBP
**/

let currencyList = ["1 USD", "113.5 JPY", "0.89 EUR", "74.36 RUB", "0.75 GBP"];

function welcome() {
    console.log("Welcome to Currency Converter!");
};

welcome();

let length = currencyList.length;
let count = 0;

do {
  console.log(`1 USD equals ${currencyList[count]}`);
  count++;
} while (count <= length);