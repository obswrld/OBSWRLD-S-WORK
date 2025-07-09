package StudentGrade;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The number of students: ");
        int students = input.nextInt();

        System.out.print("Enter The number of subjects: ");
        int subjects = input.nextInt();

        int[][] scores = new int[students][subjects];
        String[] studentName = new String[students];
        String[] subjectName = new String[subjects];

        for(int i = 0; i < students; i++){
            System.out.print("Enter Student Name: ");
            studentName[i] = input.next();

            for(int j = 0; j < subjects; j++){
                System.out.print("Enter Subject Name: ");
                subjectName[j] = input.next();
                scores[i][j] = input.nextInt();
                if(scores[i][j] < 0 && scores[i][j] > 100){
                    System.out.println("Please enter a Valid score:  ");
                } else {
                    scores[i][j] = scores[i][j];
                }

            }
        }
    }
}
