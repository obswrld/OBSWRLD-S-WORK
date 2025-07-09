import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int number = input.nextInt();
        int[] arr = new int[number];
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }

        System.out.print("Enter the elements in the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
            if(arr[i] >= 10 && arr[i] <= 100){
                boolean isDuplicate = false;
                for(int j = 0; j < arr.length; j++){
                    arr[j] = arr[j];
                    isDuplicate = true;
                    break;
                }
                if(!isDuplicate){
                    arr[i] = input.nextInt();
                }
            } else{
                System.out.println("Please enter a number ");
                i--;
            }
        }

        for(int numbers : arr){
            if(numbers != -1){
                System.out.println(numbers);
            }
        }
    }
}
