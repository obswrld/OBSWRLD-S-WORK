// //function getScoreDescending(old_result){
//     const new_result = [];    
//     for (let count = 0; count < old_result.length; count++){
//         if(old_result[count].score >= 80 && old_result[count].score < 100){
//             new_result.push(old_result[count].name)
//         }
//     }
//     return new_result
// }

const scores=(originalScores)=>{
    originalScores = originalScores.filter(getScoreDescendings);
return originalScores;
}

function getScoreDescendings(old_result){
    return old_result.score >= 80 && old_result.score < 100;
}

number = [
{"name":"tega",
    "score": 85
}, 
{"name":"tega",
    "score": 70
},
{"name":"oba",
    "score": 80
},
{"name":"maga",
    "score": 90
},
{"name":"mega",
    "score": 60
}
]
//console.log(getScoreDescending(number))
console.log(scores(number))
