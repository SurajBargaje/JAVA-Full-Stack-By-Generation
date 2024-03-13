//default parameter
function print(name="xyz"){
   console.log("Hello "+name)
}
//function expression
const square=function(num){
  return num*num
}
 
//arrow function
const sq1=(num)=>{
  return num*num
}
const sq2=(num)=> num*num
 
print();
console.log(square(2))
console.log(sq1(4))
console.log(sq2(8))
