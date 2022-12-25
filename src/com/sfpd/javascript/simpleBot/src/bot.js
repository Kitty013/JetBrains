/**
$1. Description
    Digital personal assistants help people to drive cars, plan their day, buy
    something online. In a sense, they are simplified versions of artificial
    intelligence with whom you can talk.
    In this project, you will develop step by step a simple bot that will help you
    study programming.
**/

/**
$2. Objective
    For the first stage, you will write a bot who displays a greeting, its name,
    and the date of its creation. First impressions count!
    Your program should print the following lines:
        Hello! My name is {bot_name}.
        I was created in {birth_year}.
    Instead of {bot_name}, print any name you choose and replace {birth_year}
    with the current year (four digits).
**/

/**
$3. Example
        Hello! My name is Aid.
        I was created in 2022.
    You can change the text if you want but print exactly two lines.
    Next, we will use Aid and 2022 as your bot's name and its birth year, but you
    can change it if you need to.
/**

let botName = "Kitty";
const greeting = "Hello! My name is " + botName;
let age = 2022;
const creation = "I was created in " + age;
console.log(greeting);
console.log(creation);