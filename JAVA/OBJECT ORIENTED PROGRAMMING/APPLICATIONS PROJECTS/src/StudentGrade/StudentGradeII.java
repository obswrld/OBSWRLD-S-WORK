package StudentGrade;
import java.util.Scanner;

public class StudentGradeII {


    Scanner input = new Scanner(System.in);

    private static int getNumberOfStudents(Scanner input){
        System.out.print("How many Students Do you have?  ");
        return input.nextInt();
    }
    private static int getNumberOfSubjects(Scanner input){
        System.out.print("How many Subjects Do they offer?  ");
        return input.nextInt();
    }
    private static int getScoreForSubject(int subject, Scanner input){
        int score = 0;
        do {
            System.out.print("Enter Score for Subject" + subject + ": ");
            score = input.nextInt();
            if(score < 0 || score > 100){
                System.out.println("Invalid Input");
            }
        } while (score < 0 || score > 100);
        return score;
    }
    private static void displayClassSummary(String[] studentNames, int[][] scores){
        System.out.print("========================================================");
        System.out.printf("%-20s", "Student");
        for(int i = 0; i < scores[0].length; i++){
            System.out.printf("sub%d\t", (i + 1));
        }
        System.out.printf("%-10s%-10s%-10s%n", "Total", "Average", "Position");
        System.out.println("=====================================================");

        for(int i = 0; i < scores.length; i++){
            int total = 0;
            for(int j = 0; j < scores[i].length; j++){
                total += scores[i][j];
            }
            double average = (double)total / scores[i].length;
            System.out.printf("%-20", studentNames[i]);
            for(int j = 0; j < scores[i].length; j++){
                System.out.printf("%d\t", scores[i][j]);
            }
            System.out.printf("%-10d%-10.2f%n", total, average);
        }

        System.out.println("=====================================================");
    }

}
