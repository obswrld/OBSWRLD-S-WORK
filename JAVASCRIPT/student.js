//Number 1 question


const student = {
    name: "John Doe" ,
    age: 22, 
    courses: ["Maths,", "Physics", "Computer Science"],
    address: {
        city: "New York",
        zip: 10001,
    }
};

console.log("Student's Name: ", student.name);
console.log("Second Course: ", student.courses[1]);
console.log("ZIp Code: ", student.address.zip);

// Number 2 question 
student.age = 23;
student.GPA = 4.43;
student.getDetails = function () {
    return `${this.name} is ${this.age} years old and has a GPA of ${this.GPA}.`;
};
console.log(student.getDetails());