package Arrays;


import java.util.Scanner;
import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int[] number = new int[5];
        for(int i = 0; i < number.length; i++){
            number[i] = sc.nextInt();
        }
        System.out.println("Enter number to find the index: ");
        int target = sc.nextInt();
        int index = findIndex(number, target);
        System.out.println("The index number" + target + "is: " + index);
    }
    public static int[] findSum(int[] array){
        int sum = 0;
        for(int num : array){
            sum += num;
        }
        return new int[]{sum};
    }

    public static int[] reverse(int[] array){
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        return array;
    }

    public int sumArray(int[] array){
        int sum = 0;
        for(int num : array){
            sum += num;
        }
        return sum;
    }

    public static int findIndex(int[] array, int number){
        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static int minimum(int[] array){
        int min = array[0];
        for(int num : array){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    public static int highestOccurance(int[] array){
        int count = 0;
        int target = array[0];
        for(int num : array){
            if(num == target){
                count++;
            }
        }
        return count;
    }

    public static int[] merge(int[] array1, int[] array2){
        int[] merged = new int[array1.length + array2.length];
        for(int i = 0; i < array1.length; i++){
            merged[i] = array1[i];
        }

        for(int j = 0; j < array2.length; j++){
            merged[array1.length + 1] = array2[j];
        }
        return merged;
    }


    

}
