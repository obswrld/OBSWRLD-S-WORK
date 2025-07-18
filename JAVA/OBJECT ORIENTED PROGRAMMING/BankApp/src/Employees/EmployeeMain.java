package Employees;

import Dates.Date;
import Employees.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Date birth = new Date(5, 7, 2004);
        Date hire = new Date(5, 7, 2025);
        Employee employee = new Employee("Micheal", "James", birth, hire);
        System.out.println(employee);
    }
}
