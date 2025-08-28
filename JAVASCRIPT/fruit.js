const inventory = {
    apple: 10,
    banana: 5,
    orange: 8,
    mango: 12,
};
for(let key in inventory){
    console.log(`$${key}: $${inventory[key]}`);
}