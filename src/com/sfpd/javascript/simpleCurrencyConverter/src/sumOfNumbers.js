/**
    You are given an array of numbers called numbers. Calculate the sum of numbers
    and return it from the function. If the next number is equal to 0, the program
    must stop processing the numbers and return the result.

    Sample Input 1:

    11 12 15 10 0 100
    Sample Output 1:

    48
    Sample Input 2:

    100 0 100
    Sample Output 2:

    100
**/

let numbers = [11 ,12 ,15 ,10 ,0 ,100];

  for (const number in numbers) {
    let result = result + numbers[number];
    if (numbers[number] === 0) {
      console.log(result);
      break;
    };

  } return result;

console.log(result);
