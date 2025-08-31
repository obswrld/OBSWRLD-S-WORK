// Question 1:
const book = {
    title: "48 Laws of Power",
    author: "Carlos Wilson",
    yearPublished: 2002,
    isAvailable: true
};
console.log(book)


// Question 2:
console.log(book.title);
book.isAvailable = false;
book.genre = "Motivation";
console.log(book);


// Question 3:
const movie = [
    {
        title: "Formular 1",
        director: "Brad Pitt",
        releasedYear: 2025,
        rating: 9.7
    },
    {
        title: "Mission Impossible",
        director: "Tom Cruise",
        releasedYear: 2025,
        rating: 9.8
    },
    {
        title: "Gladiator",
        director: "James Parker",
        releasedYear: 2024,
        rating: 8.9
    }  
];
console.log(movie);

// Question 4: Looping through the arrays 
movie.forEach(film => {
    console.log(`title: ${film.title}, director: ${film.director}`);
})


// Question 5:
book.getSummary = function () {
    return `Title: ${this.title}, Author: ${this.author}, Year Published: ${this.yearPublished}, Available: ${this.isAvailable}`
};
console.log(book.getSummary());

// Question 6:
const university = {
    name: "Landmark University",
    location: "Kwara State",
    department: [ 
        {
            name: "Civil Engineering",
            head: "Mr Isaac"
        },
        {
            name: "Accounting",
            head: "Mr Oyewole"
        },
        {
            name: "Mathematics",
            head: "Mr Salusi"
        }
    ]
};

console.log(university);


// Question 7:
console.log("Keys: ", Object.keys(book));
console.log("Values: ", Object.values(book));
console.log("Entries: ", Object.entries(book));


//Question 8: 
function Car(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.getCarInfo = function(){
        return `Car make: ${this.make}, Model: ${this.model}, Year: ${this.year}`;
    };
}
const toyota = new Car("Camry", "XLE", 2020);
console.log(toyota.getCarInfo());


// Question 9:
class Cars {
    constructor(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    getCarInfos() {
        return `Car make: ${this.make}, Model: ${this.model}, Year: ${this.year}`;
    };
}

const anotherCar = new Cars("Honda", "LSV", 2021);
console.log(anotherCar.getCarInfos());


//Question 10: Using JSON Strigify to conver object to string and then using JSON parse to conver it back to int 
function deepClone(obj){
    return JSON.parse(JSON.stringify(obj));
}
const original = {a: 1, b: {c: 2}};
const clone = deepClone(original);
console.log(clone);

// Question 10:
function areObjectsEqual(obj1, obj2){
    const key1 = Object.keys(obj1);
    const key2 = Object.keys(obj2);


    if(key1.length !== key2.length){
        return false;
    }
    for (let key of key1) {
        if(obj1[key] !== obj2[key]){
            return false;
        }
        return true;
    }
}

const objA = {x: 1, y: 2};
const objB = {x: 1, y: 2};
const objC = {x: 1, y: 3, z: 7};

console.log(areObjectsEqual(objA, objB));
console.log(areObjectsEqual(objA, objC));

