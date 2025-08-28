const company = {
    name: "TechCorp",
    location: "San Francisco",
    employees: [
        {id: 1, name: "Alice Johnson", department: "Engineering"},
        {id: 2, name: "Bob Smith", department: "HR"},
        {id: 3, name: "Charlie Brown", department: "Marketing"},
        {id: 4, name: "Diana Prince", department: "Engineering"}
    ]
};
console.log(`The Second Employee's Name is: ${company.employees[1].name}`);

const { name: companyName, location : companyLocation} = company;
console.log(`Company's name: ${companyName}`);
console.log(`Company's Location: ${companyLocation}`);

console.log("Employee's List: ");

company.employees.forEach(employee => {
    console.log(`${employee.name} ${employee.department}`);
})
