
// Object Literal Syntax
const person = {
    name: "oba",
    id: 1, 
    isEmployed: true 
};
console.log(person);



// New Ojbject Constructor
const car = new Object();
car.make = "Toyota";
car.model = "Camry";
car.year = 2020;
console.log(car);



// Constructor Function
function Animal(type, sound){
    this.type = type;
    this.sound = sound;
}
const dog = new Animal("Dog", "Bark");
const cat = new Animal("Cat", "Meow");
console.log(cat);
console.log(dog);



// ES6 Classes 
class Person {
    constructor(name, age){
        this.name = name;
        this.age = age;
    }
}
const alex = new Person("Alice", 25);
console.log(alex);