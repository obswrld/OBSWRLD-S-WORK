package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

    }
}
