import java.util.Scanner;

public class FireDrill1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int average = 0;
        int total = 0;
        for(int i = 1; i < 10; i++){
            System.out.println("Enter number: ");
            int number = input.nextInt();
            total += number;
        }
        average = total / 10;
        System.out.println("The average number is: " + average);
    }
}
