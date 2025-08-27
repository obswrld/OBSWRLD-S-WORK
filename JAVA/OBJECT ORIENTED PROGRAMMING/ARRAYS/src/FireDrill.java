import java.util.Scanner;

public class FireDrill {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Enter numbers: ");
            int numbers = input.nextInt();
            total = total + numbers;
        }
        System.out.println("The total number is: " + total);
    }
}
