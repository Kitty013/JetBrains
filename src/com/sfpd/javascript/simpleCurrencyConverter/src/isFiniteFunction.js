/** isFinite() function
 *  You should calculate the sum of all values in the data array and check
 *  that it is a finite number. Output the result of the check to the console.
**/

let data = [5, -13, 3, 21, 0, 9];

function sum(data) {
  let result = 0;
  for (const number in data) {
    result =+ data[number];
    return result;
  };
};

console.log(isFinite(sum(data)));
