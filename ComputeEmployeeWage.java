package WageComputation;

import java.util.Random;
import java.util.Scanner;

public class ComputeEmployeeWage {
    // Class variables
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    // Method to compute employee wage
    public void computeWage(String employeeName) {
        Random random = new Random();
        int totalWage = 0;
        int totalDays = 0;
        int totalHours = 0;

        System.out.println("Wage Calculation for " + employeeName + ":\n");

        while (totalDays < MAX_WORKING_DAYS && totalHours < MAX_WORKING_HOURS) {
            int attendance = random.nextInt(3); // 0-Absent, 1-Part-Time, 2-Full-Time
            int hoursWorked = 0;

            switch (attendance) {
                case 0:
                    System.out.println("Day " + (totalDays + 1) + ": Absent");
                    break;
                case 1:
                    hoursWorked = PART_TIME_HOURS;
                    System.out.println("Day " + (totalDays + 1) + ": Present (Part-Time), Hours = " + hoursWorked);
                    break;
                case 2:
                    hoursWorked = FULL_DAY_HOURS;
                    System.out.println("Day " + (totalDays + 1) + ": Present (Full-Time), Hours = " + hoursWorked);
                    break;
            }

            if (totalHours + hoursWorked > MAX_WORKING_HOURS) {
                hoursWorked = MAX_WORKING_HOURS - totalHours;
            }

            int dailyWage = WAGE_PER_HOUR * hoursWorked;
            totalWage += dailyWage;
            totalHours += hoursWorked;
            totalDays++;
        }

        System.out.println("\nSummary:");
        System.out.println("Employee: " + employeeName);
        System.out.println("Total Days Worked: " + totalDays);
        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Total Wage: ₹" + totalWage);
    }

    // Main method to run
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeWageBuilder wageBuilder = new EmployeeWageBuilder();

        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        wageBuilder.computeWage(employeeName);
        scanner.close();
    }
}
