const inventory = {
    apple: 10,
    banana: 5,
    orange: 8,
    mango: 12,
};
let totalFruits = 0;
for(let key in inventory){
    const quantity = inventory[key];
    console.log(`$${key}: $${inventory[key]}`);
    totalFruits += quantity;
}
console.log(`Total Number of fruits: ${totalFruits}`);