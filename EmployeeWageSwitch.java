package WageComputation;

import java.util.Scanner;
import java.util.Random;

public class EmployeeWageSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Constants
        final int WAGE_PER_HOUR = 20;
        final int PART_TIME_HOURS = 4;
        final int FULL_TIME_HOURS = 8;

        // Get employee name
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        // Generate attendance status: 0-Absent, 1-Part-time, 2-Full-time
        int attendance = random.nextInt(3);
        int dailyWage = 0;

        // Switch case for attendance
        switch (attendance) {
            case 0:
                System.out.println(employeeName + " is Absent");
                System.out.println("Daily Wage = ₹0");
                break;
            case 1:
                dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
                System.out.println(employeeName + " is Present (Part-Time)");
                System.out.println("Daily Wage = ₹" + dailyWage);
                break;
            case 2:
                dailyWage = WAGE_PER_HOUR * FULL_TIME_HOURS;
                System.out.println(employeeName + " is Present (Full-Time)");
                System.out.println("Daily Wage = ₹" + dailyWage);
                break;
            default:
                System.out.println("Invalid attendance value");
        }

        scanner.close();
    }
}
