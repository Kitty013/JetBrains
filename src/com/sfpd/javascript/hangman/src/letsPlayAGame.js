/** 1. Description
 *  In this stage, we will add some simple gameplay. There will be two possible outcomes. Let's first
 *  print a welcoming message and then ask players to guess the word we have set for the game. If they
 *  guess the word, the game reports a win; otherwise, it will "hang" the player.
 *
 *  To simplify getting input from the console, we're using a JS library, check out the documentation
 *  to see how it's used.
 * 
 *  2. Objectives
 *   - Ask players for a possible word;
 *   - Print You survived! if users guess the word;
 *   - Print You lost! if users fail.
 * 
 *   In this stage, python is the word that players need to guess. For now, this is the only form
 *   of answer that is deemed correct, so there is no need to worry about the register or punctuation
 *   marks.
 *  
 *  3. Examples
 *  
 *  Example 1:
 *      H A N G M A N
 *      Guess the word: > python
 *      You survived!
 * 
 *  Example 2:
 *      H A N G M A N
 *      Guess the word: > java
 *      You lost!
 */

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
