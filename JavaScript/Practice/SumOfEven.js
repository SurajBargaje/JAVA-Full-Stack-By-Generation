// Write a JavaScript program to calculate the sum of all even numbers between two given numbers.
let num1 = 1;
let num2 = 10;

let sum = 0;
for (i=num1;i<=num2;i++){
  if(i%2===0){
    sum += i;
  }
}
console.log(`Sum of Even numbers between ${num1} and ${num2} is `+ sum);

