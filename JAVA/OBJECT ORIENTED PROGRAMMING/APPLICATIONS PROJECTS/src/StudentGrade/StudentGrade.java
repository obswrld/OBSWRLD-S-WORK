package StudentGrade;

import java.util.Scanner;

public class StudentGrade {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int students = StudentGradeFunction.getNumberOfStudents();
        int subjects = StudentGradeFunction.getNumberOfSubjects();
        System.out.println("Saving.........");
        System.out.println("Saved successfully");

        String[] studentNames = new String[students];
        int[][] scores = new int[students][subjects];

        for(int i = 0; i < students; i++){
            System.out.println("Enter Student" + (i+1) + " Name:");
            studentNames[i] = input.nextLine();
            for(int j = 0; j < subjects; j++){
                scores[i][j] = StudentGradeFunction.getScoreForSubject(j + 1);
            }
            System.out.println("Saving.........");
            System.out.println("Saved successfully");
        }

        StudentGradeFunction.displayClassSummary(studentNames, scores);
    }
}
