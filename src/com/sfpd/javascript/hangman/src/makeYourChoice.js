/** 1. Description
 *  If there is only one word, the game becomes dull. You already know the word, and there?s no
 *  challenge. In this stage, let's make the game more difficult by choosing a word from the special
 *  list with a variety of options. This way, our game gains in replayability.
 * 
 *  2. Objectives
 *   - Create the following list of words: python, java, swift, javascript;
 *   - Program the game to choose a word from the list at random (you can use the Math.random()
 *     method for that). You can enter more words, but let's stick to these four for now.
 *  
 *  3. Examples
 *  Example 1: computer chooses python from the list.
 *      H A N G M A N
 *      Guess the word: > python
 *      You survived!
 * 
 *  Example 2: computer chooses something other than python from the list.
 *      H A N G M A N
 *      Guess the word: > python
 *      You lost!
 *      
 *  Example 3: computer randomly chooses something other than swift from the list.
 *      H A N G M A N
 *      Guess the word: > swift
 *      You lost!
 */

// Use "input()" to input a line from the user
// Use "input(str)" to print some text before requesting input
// You will need this in the following stages
//const input = require('sync-input')

let title = 'H A N G M A N';
console.log(title)

let question = 'Guess the word: ';
let answer = String(prompt(question)).toLowerCase();
let word = 'python';

if (answer === word) {
    console.log('You survived!')
} else {
    console.log('You lost!')
}