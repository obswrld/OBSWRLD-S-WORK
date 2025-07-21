function higherFunction() {
    console.log("higher function")
}
function lowerFunction(callback){
    console.log("lower function")
    callback()
}
lowerFunction(higherFunction);


function operation(callBack, x, y) {
    return callBack(x, y)
}
function add(x, y){
    return x + y
}
function multiply(a,b) {
    return a * b
}

number = 30
number2 = 20
console.log(operation(add,number,number2))
console.log(operation(multiply,3,5))



