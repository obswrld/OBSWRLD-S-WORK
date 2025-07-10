package StudentGrade;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The number of students you have: ");
        int students = input.nextInt();

        System.out.print("Enter The number of subjects for the student you have: ");
        int subjects = input.nextInt();
        if(subjects < 9 || subjects > 16){
            System.out.println("A Student must have a subject between 9 and 16");
            System.out.print("Enter The number of subjects for the student you have: ");
            subjects = input.nextInt();
        } else{
            System.out.print("Saving.........");
            System.out.print("Saved successfully");
        }

        int[][] scores = new int[students][subjects];
        String[] studentName = new String[students];
        String[] subjectName = new String[subjects];

        for(int i = 0; i < students; i++){
            System.out.print("Enter Student Name: ");
            studentName[i] = input.next();

            for(int j = 0; j < subjects; j++){
                System.out.println("Enter Subject Name: ");
                subjectName[j] = input.next();
                System.out.println("Enter Score: ");
                scores[i][j] = input.nextInt();
                if(scores[i][j] < 0 && scores[i][j] > 100){
                    System.out.println("Please enter a Valid score:  ");
                    scores[i][j] = input.nextInt();
                } else {
                    scores[i][j] = scores[i][j];
                    System.out.println("Saving.........");
                    System.out.print("Saved successfully");
                }

            }
        }
    }
}
