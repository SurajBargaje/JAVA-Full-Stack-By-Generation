// Write a JavaScript program to count the number of vowels in a given string using a loop and conditional statements

let myString = 'Hello i am java developer';

let count = 0;

for(i=0;i<myString.length;i++){
  if(myString[i]==='a'|| myString[i]==='e' ||myString[i]==='i'||myString[i]==='o'||myString[i]==='u'){
    count += 1;
  }
}
console.log(count);



