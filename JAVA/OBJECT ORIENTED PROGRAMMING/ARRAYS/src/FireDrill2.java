import java.util.Scanner;

public class FireDrill2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int average = 0;
        for(int i = 0; i < 10; i++) {
            System.out.println("Please enter a number");
            int number = input.nextInt();
            total += number;
        }
        average = total / 10;
        System.out.println("The average number is: " + average);
        System.out.println("The total number is: " + total);
    }
}
