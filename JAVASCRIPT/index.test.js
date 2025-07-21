const test = require("node:test")
const getEvenNumbers = require("./functions")

test("that the functions returns even numbers",()=>{
    const arrayOfNumbers = [1, 2, 3, 4, 5, 6, 7, 8];//Arrange
    const result = getEvenNumber(arrayOfNumbers);//Act
    expect(result).toEqual([2, 4, 6, 8])
})