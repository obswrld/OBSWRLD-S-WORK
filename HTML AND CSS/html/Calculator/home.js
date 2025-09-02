const display_calculator = document.getElementById("display_calculator");

function clickToDisplay(input) {
    display_calculator.value += input;
}

function calculate(){
    try{
        display_calculator.value = eval(display_calculator.value);        
    }
    catch(error){
        display_calculator.value = "Error";
    }
}

function clearOnDisplay(){
    display_calculator.value = " ";

}