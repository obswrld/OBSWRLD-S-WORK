import java.util.Scanner;

public class FireDrill3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int number = 0;
        for(int i = 0; i < 10; i++) {
            System.out.println("Enter Number: ");
            number = input.nextInt();

            if(i % 2 == 0) {
                total += number;
            }
        }
        System.out.println("The total number is: " + total);
    }
}
