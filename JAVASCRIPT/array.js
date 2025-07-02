
//push and pop
let result = []
result.push(1);
console.log(result);
result.push("Hello")
console.log(result);
result.push(1==1);
console.log(result);
result.push("name: Oba");
console.log(result);

result.pop();
console.log(result);
result.push("ball");

let item_pop = result.pop();
console.log("This is th item to be popped:  " + item_pop);
console.log(result);


// shift and unshift
let shift_item = result.shift();
console.log("This the shift result:  " + shift_item);
console.log(result);
let unshift_item = result.unshift("Biro");
console.log("This is the unshift item:  " + unshift_item);
console.log(result);


//concat method 
let new_array = ["Ade", "Baller", "More items", 10]
let join_array = result.concat(new_array);
console.log(join_array);


//
