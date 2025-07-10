package CreditCardValidation;

public class CreditCardValidation {
    private String cardNumber;
    private String cardType;
    public CreditCardValidation(String cardNumber, String cardType) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public String getCardType() {
        return cardType;
    }
    private String determineCardNumber(String cardNumber){
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

    public int getCreditCardNumber(String cardNumber){
        return cardNumber.length();
    }

}
