//  Write a JavaScript program to find the sum of all numbers divisible by 3 or 5 below a given number
let number = 20;

let sum=0;
for(i=0;i<=number;i++){
  if(i%3==0 || i%5==0){
    sum += i;
  }
}

console.log(sum);
