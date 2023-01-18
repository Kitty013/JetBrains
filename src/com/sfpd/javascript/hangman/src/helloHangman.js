/** 1. Description
 *  Hangman is a popular, funny, yet very grim game. A cruel computer hides a word from you and
 *  you need to guess it, letter by letter. If you fail, you'll be hanged, if you win, you'll survive.
 *
 *  You're probably familiar with the rules; now you can create this game yourself!
 *
 *  Let's take a brief look at what you are going to build in this project. Here is what the gameplay
 *  will look like:
 *
 *  - In the main menu, players can choose to either play or exit the game;
 *  - If players choose to play, the computer picks a word from a list ? it will be the answer;
 *  - The computer asks players to enter a letter that may or may not be in the word;
 *  - If players suggest a letter that does not appear in the word for the first time, It's a miss.
 *    A player can miss 8 times before the game is over;
 *  - If the letter does occur in the word, the computer notifies the players. If there are letters
 *    left to guess, the computer invites the player to go on;
 *  - When the entire word is uncovered ? it's a victory! The game should calculate the final score
 *    and return to the main menu.
 *  - This may sound complex, but the project is split into small stages with the hints that will
 *    guide you. We guarantee that the final product is replayable and quite engaging!
 *
 *  Let's start with an announcement that will greet the player. You already know how to log to the
 *  console with JavaScript. Apply that knowledge to entice your friends to play with an announcement
 *  for your game!
 *  
 *  2. Objectives
 *  In this stage, write a program that prints the lines shown in the example below.
 *  
 *  3. Example
 *  Output:
 *      H A N G M A N
 *      The game will be available soon.
 */

// Use "input()" to input a line from the user
// Use "input(str)" to print some text before requesting input
// You will need this in the following stages
//const input = require('sync-input')
    
let welcome = 'H A N G M A N \nThe game will be available soon';
console.log(welcome)

// let isUserChoiceValid;
// let userChoice;
//
// do {
//     start()
//     playOrExit(userChoice)
// } while(!isUserChoiceValid)
//
// function start() {
//     let question = "Would you like to play Hangman? 1-play 2-exit"
//     userChoice = Number(prompt(question))
//     isUserChoiceValid = userChoice === 1 || userChoice === 2
//     if (!isUserChoiceValid) {
//         console.log("Unknown input")
//     }
//     return userChoice
// }
//
// function playOrExit(userChoice) {
//     switch (userChoice) {
//         case 2:
//             console.log("Have a nice day!")
//             break;
//         case 1:
//             console.log("Let's play")
//     }
// }