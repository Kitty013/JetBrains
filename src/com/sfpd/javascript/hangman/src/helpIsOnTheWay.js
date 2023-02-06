/** 1. Description
    The game is now more difficult to beat; your chances of guessing the word depend
    on the list size. If there are four words in the list, you have a 25% chance.
    Let's show a little mercy and add hints for our players.

    2. Objectives
    As in the previous stage, use the following word list: python, java, swift, javascript;
    Once the computer has chosen a word from the list, show its first three letters.
    Replace the hidden letters with hyphens (-).

    3. Examples
    The greater-than symbol followed by a space (> ) represents the user input.
    Note that it's not part of the input.

    Example 1:
    H A N G M A N
    Guess the word jav-: > java
    You survived!

    Example 2:
    H A N G M A N
    Guess the word pyt---: > pythia
    You lost!
**/
// Use "input()" to input a line from the user
// Use "input(str)" to print some text before requesting input
// You will need this in the following stages
// const input = require('sync-input')

let title = 'H A N G M A N';
console.log(title)

let list = ["python", "java", "swift", "javascript"];
let index = Math.floor(Math.random() * list.length);
let word = list[index];
let hint = word.substring(0,3);
let hidden = [];

let hideLetters = word.substring(3, word.length + 1) ;
let hiddenLetters = Array.from(hideLetters);
hiddenLetters.forEach( letter => {
    hiddenLetters.shift();
    hidden.push('-');
});

console.log(hint);
console.log(hideLetters);
console.log(hiddenLetters);
console.log(hidden);

let question = 'Guess the word: ' + hint + hidden ;
let answer = String(prompt(question)).toLowerCase();

if (answer === word) {
    console.log('You survived!')
} else {
    console.log('You lost!')
}

