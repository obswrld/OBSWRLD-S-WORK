package Dates;

public class Date {
    private int day;
    private int month;
    private int year;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int day, int month, int year) {
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 & day == 29))) {
            throw new IllegalArgumentException("Day (" + day + ") out of range for the the specified month of the year");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month (" + month + ") must be between 1 and 12");
        }
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day + ") out of range of the specified month of the year");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
}
