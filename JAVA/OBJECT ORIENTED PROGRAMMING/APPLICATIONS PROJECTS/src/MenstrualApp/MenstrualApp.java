package MenstrualApp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class MenstrualApp {
    static Scanner input = new Scanner(System.in);
    public static LocalDate calculateNextPeriodDate(LocalDate lastPeriodDate, int cycleLength){
        return  lastPeriodDate.plusDays(cycleLength);
    }
    public static LocalDate calculateOvulationDate(LocalDate lastPeriodDate){
        return lastPeriodDate.plusDays(14);
    }
    public static boolean isCycleLengthValid(int cycleLength){
        return  cycleLength >= 21 && cycleLength <= 35;
    }
    public static boolean isPeriodLengthValid(int periodLength){
        return  periodLength >= 3 &&  periodLength <= 7;
    }
    public static LocalDate getValidDate(Scanner input){
        while(true){
            System.out.println("Please enter last period date(YYYY-MM-DD):  ");
            String lastPeriodInput = MenstrualApp.input.next();
            try{
                return LocalDate.parse(lastPeriodInput, DateTimeFormatter.BASIC_ISO_DATE);
            } catch (DateTimeParseException e){
                System.out.println("Please enter a Valid date (YYYY-MM-DD):  ");
            }
        }
    }

}
