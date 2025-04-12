package WageComputation;

import java.util.Scanner;
import java.util.Random;

public class WageUntilCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Constants
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4;
        final int MAX_WORKING_DAYS = 20;
        final int MAX_WORKING_HOURS = 100;

        // Input employee name
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        int totalWage = 0;
        int totalDays = 0;
        int totalHours = 0;

        while (totalDays < MAX_WORKING_DAYS && totalHours < MAX_WORKING_HOURS) {
            int attendance = random.nextInt(3); // 0-Absent, 1-Part-Time, 2-Full-Time
            int hoursWorked = 0;

            switch (attendance) {
                case 0:
                    System.out.println("Day " + (totalDays + 1) + ": " + employeeName + " is Absent");
                    break;
                case 1:
                    hoursWorked = PART_TIME_HOURS;
                    System.out.println("Day " + (totalDays + 1) + ": " + employeeName + " is Present (Part-Time), Hours = " + hoursWorked);
                    break;
                case 2:
                    hoursWorked = FULL_DAY_HOURS;
                    System.out.println("Day " + (totalDays + 1) + ": " + employeeName + " is Present (Full-Time), Hours = " + hoursWorked);
                    break;
            }

            // Prevent exceeding max hours
            if (totalHours + hoursWorked > MAX_WORKING_HOURS) {
                hoursWorked = MAX_WORKING_HOURS - totalHours; // Adjust last day's hours
            }

            int dailyWage = WAGE_PER_HOUR * hoursWorked;
            totalWage += dailyWage;
            totalHours += hoursWorked;
            totalDays++;
        }

        System.out.println("\nSummary for " + employeeName + ":");
        System.out.println("Total Working Days = " + totalDays);
        System.out.println("Total Working Hours = " + totalHours);
        System.out.println("Total Monthly Wage = ₹" + totalWage);

        scanner.close();
    }
}

