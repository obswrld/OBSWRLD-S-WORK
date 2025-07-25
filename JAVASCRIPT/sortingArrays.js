function mergeArrays(arr1, arr2){
    merge = arr1.concat(arr2)
    merge.sort()
    let medianMerge = Math.floor(merge.length / 2)
    if(merge.length % 2 === 0){
        return (merge[medianMerge - 1] + merge[medianMerge]) / 2;
    } else{
        return merge[medianMerge]
    }
    return merge
}

arr1 = [10, 15, 25]
arr2 = [25, 13, 39]
result = mergeArrays(arr1, arr2)
console.log(result)