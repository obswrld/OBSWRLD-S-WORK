package ARRAYLIST;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayTask {
    public static void main(String[] args) {
        int[] r = new int[10];
        System.out.println(r[9]);

        int[] g = new int[6];
        for(int i = 0; i < g.length; i++){
            g[i] = -1;
        }

        double[] c = new double[100];
        double max = c[0];
        for(int i = 0; i < c.length; i++){
            if(c[i] > max){
                max = c[i];
            }
        }

        int[] a = new int[100];
        int[] b = new int[100];
        for(int i = 0; i < 2; i++){
            b[i] = a[i];
        }
        for(int i = 2; i < 9; i++){
            for(int j = 9; j < i; j++){
                b[i] = a[j];
            }
        }
        for(int i = 10; i < 100; i++){
            b[i] = a[i];
        }

        //Next question
        //1 Declaring t in a 2 by 3 dimensional array
        int[][] t = new int[2][3];
        //2 t has 2 columns
        //3 t has 3 rows
        //4 t has 6 elements
        //5 expression of all elements in row 1
        // t[1][0], [1][1], [1][2];
        //6 expression of all elements in column 2 of t
        // t[0][2], [1][2];
        //7 expression of all elements in row 0 and column 1 initilize to 0
        t[0][1] = 0;
        //8 initialize all elements to 0
        t[0][0] = 0;
        t[0][2] = 0;
        t[1][1] = 0;
        t[1][0] = 0;
        t[1][2] = 0;
        //9 initialize all elements to 1;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                t[i][j] = 1;
                System.out.print(t[i][j] + " ");
                System.out.println();
            }
        }
        //10 initialize all elements to numbers placed by the user
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Enter the number for  [" + i + "][" + j + "]:  ");
                t[i][j] = input.nextInt();
            }
        }
        //11 get the smallest value of all elements
        int min = t[0][0];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                if(t[i][j] < min){
                    min = t[i][j];
                }
            }
            System.out.println(min + " ");
        }

        //12 prints all the elements in the first roll of t
        System.out.printf("%d%d%d\n",t[0][0], t[0][1], t[0][2]);
        System.out.println();
        int sum = t[0][2] + t[1][2];
        System.out.println(sum);

        System.out.println(" 0 1 2");
        for(int i = 0; i < 2; i++){
            System.out.print(i + " ");
            for(int j = 0; j < 3; j++){
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}
