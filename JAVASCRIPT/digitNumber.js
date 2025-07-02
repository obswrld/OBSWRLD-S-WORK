function getProductNumber(number){
    for(let count = 1; count < 10; count++){
        for(let counter = 1; counter < 10; counter++){
            if(count * counter === number && count != counter){
                console.log(counter)
            }
        }
    }
}
let result = 45
console.log(getProductNumber(result))