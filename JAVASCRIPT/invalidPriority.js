function getInvalidPriority(valid_array){    
    invalid_array = []
    for (let count = 0; count < valid_array.length; count++){
        if(valid_array[count] > 0 && valid_array[count] < 6){
            invalid_array.push(valid_array[count]);
        }
    }
    return invalid_array;
}

numbers = [3, 5, 6, 4, 1, 0, 7, 8, 9]
console.log(getInvalidPriority(numbers));
