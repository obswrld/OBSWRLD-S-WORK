const bank = {
    owner: "Alice",
    balance: 500,

    deposit: function(amount) {
        this.balance += amount;
        console.log(`Depostied Amount: $${amount}. New Balance: $${this.balance}.`);
    },
    withdraw: function(amount) {
        if(this.balance - amount < 0) {
            console.log(`withdrawal of $${amount} Failed. Insufficient funds.`);
            return false;
        } else {
            this.balance -= amount;
            console.log(`withdrawal of $${amount}. New balance: $${this.balance}.`);
            return true;
        }
    }
};
bank.deposit(10000);
const withdrawSuccess = bank.withdraw(40000);
const withdrawSuccesses = bank.withdraw(200);
console.log("Final Balance: ", bank.balance);