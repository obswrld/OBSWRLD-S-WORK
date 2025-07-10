package CreditCardValidation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CreditCardValidationIII {
    public static void main(String[] args) {
        List<String> cardDetails = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Credit Card Number To Verify Please: ");
        System.out.println("Enter Credit Card Number: ");
        String cardNumber = input.nextLine().trim();

        CreditCardValidation creditCard = new CreditCardValidation(cardNumber);
        boolean isCardValid = CreditCardValidationII.validateCreditCardNumber(cardNumber);

        if(isCardValid){
            String cardStatus = "Valid";

            cardDetails.add("Credit Card Type: " + creditCard.getCardType());
            cardDetails.add("Credit Card Number: " + creditCard.getCardNumber());
            cardDetails.add("Credit Card Length: " + creditCard.getCardLength(creditCard.getCardNumber()));
            cardDetails.add("Credit Card Validity Status: " + cardStatus);
        } else {
            cardDetails.add("Invalid Credit Card Number");
        }

        System.out.println("***************************************************************************");
        for (String cardDetail : cardDetails) {
            System.out.println("**" + cardDetail + "**");
        }
        System.out.println("***************************************************************************");
    }

}
