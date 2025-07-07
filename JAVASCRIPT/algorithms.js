function isAmstrongNumber(num){
    let num1 = num;
    let num2 = num;
    let numOfDigits = 0;

    if (num === 0){
        numOfDigits = 1
    }else {
        while(num2 > 0){
            num2 = (num2 - (num2 % 10)) / 10
            numOfDigits++;
        }
    }

    let sum = 0;
    num2 = num1;

    while (num2 > 0){
        let numbers = num2 % 10;
        let number = 1;

        for(let i = 0; i < numberOfDigits; i++){
            number *= numbers
        }
    }
    sum += number;
    num2 = (num2 - number) / 10;

    return sum === num1;
}
