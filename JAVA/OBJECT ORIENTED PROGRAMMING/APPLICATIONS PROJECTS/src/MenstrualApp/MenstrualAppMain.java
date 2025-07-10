package MenstrualApp;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MenstrualAppMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name:  ");
        String name = input.nextLine();

        int cycleLength = 0;
        while(true){
            System.out.println("Please Enter Your Cycle Length:  ");
            cycleLength = input.nextInt();
            if(MenstrualApp.isCycleLengthValid(cycleLength)){
                break;
            } else {
                System.out.println("Error! Cycle Length must be between 21 and 35 days. if this is not the case, i advice you see the doctor for further treatment Ma'am or Please try again:    ");
            }
        }

        int periodLength = 0;
        while(true){
            System.out.println("Please Enter Your Period Length:  ");
            periodLength = input.nextInt();
            if(MenstrualApp.isPeriodLengthValid(periodLength)){
                break;
            } else {
                System.out.println("Error:  Period Length must be between 3 and 7 days. If this is not the case, i advise you see the doctor for further treatment Ma'am or try again:    ");
            }
        }

        LocalDate lastPeriodDate = MenstrualApp.getValidDate(input);
        LocalDate nextPeriodDate = MenstrualApp.calculateNextPeriodDate(lastPeriodDate, cycleLength);
        LocalDate ovulationDate = MenstrualApp.calculateOvulationDate(lastPeriodDate);
        LocalDate safePeriodStart = lastPeriodDate.plusDays(periodLength + 1);
        LocalDate safePeriodEnd = ovulationDate.minusDays(1);

        System.out.println("Hello " + name);
        System.out.println("Your next period is expected on: " + nextPeriodDate);
        System.out.println("Your ovulation period is expected on: " + ovulationDate);
        System.out.println("Your safe period is expected on: " + safePeriodStart);
        System.out.println("Your safe end period is expected on: " + safePeriodEnd);


    }
}
