package CreditCardValidation;

public class CreditCardValidationII {

    public static boolean validateCreditCardNumber(String cardNumber){
        if(cardNumber.length() < 13 || cardNumber.length() > 16){
            return false;
        }
        int totalSum = 0;
        boolean isEven = false;
        for(int i = cardNumber.length() - 1; i >= 0; i--){
            int digit = Character.getNumericValue(cardNumber.charAt(i));

            if(isEven){
                digit *= 2;
                if(digit > 9){
                    digit -= 9;
                }
            }
            totalSum += digit;
            isEven = !isEven;
        }
        return (totalSum % 10 == 0);
    }
}
