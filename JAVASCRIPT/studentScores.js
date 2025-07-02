function get_score(score_array){
    new_score_array = []
    for(let count = 0; count < score_array.length; count++){
        if(score_array[count] > 50){
            new_score_array.push(score_array[count])
        }
    }
    return new_score_array;
}

score = [10, 98, 100, 50, 69, 77, 75, 78, 23, 89]
console.log(get_score(score));
