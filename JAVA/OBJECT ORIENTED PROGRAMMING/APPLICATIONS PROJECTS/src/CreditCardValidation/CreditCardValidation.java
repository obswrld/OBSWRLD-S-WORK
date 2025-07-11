package CreditCardValidation;

public class CreditCardValidation {
    private String cardNumber;
    private String cardType;
    public CreditCardValidation(String cardNumber) {
        this.cardNumber = cardNumber;
        this.cardType = determineCardNumber();
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public String getCardType() {
        return cardType;
    }
    private String determineCardNumber(){
        if(cardNumber.startsWith("4")){
            return "Visa";
        } else if (cardNumber.startsWith("5")) {
            return "MasterCard";
        } else if (cardNumber.startsWith("37")) {
            return "American Express";
        } else if (cardNumber.startsWith("6")) {
            return "Discover";
        } else {
            return "Invalid Card Number";
        }
    }

    public int getCardLength(String cardNumber){
        return cardNumber.length();
    }

}
