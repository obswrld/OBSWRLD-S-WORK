import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class OneDimensionalArray {
    public static void main(String[] args) {
        int[] array = new int[20];
        int count = 0;
        for(int i = 10; i < array.length; i++){
            array[i] = 2;
        }
        System.out.println(Arrays.toString(array));

        int[] bonus = {2, 4, 5, 6, 5, 6, 8, 9, 10, 12, 15, 6, 7, 8, 9, 10, 4, 7, 3, 8};
        for(int i = 0; i < bonus.length; i++){
            bonus[i] *= 2;
        }
        System.out.println(Arrays.toString(bonus));

        int[] bestScores = {50, 70, 69, 75, 88, 90, 56, 77, 8, 99, 56, 88};
        for(int i = 0; i < bestScores.length; i++){
            System.out.println(bestScores[i]);
        }
    }
}
