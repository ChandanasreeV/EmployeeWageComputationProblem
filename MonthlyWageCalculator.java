package WageComputation;

import java.util.Scanner;
import java.util.Random;

public class MonthlyWageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Constants
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4;
        final int WORKING_DAYS = 20;

        // Input employee name
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        int totalWage = 0;

        // Loop through each working day
        for (int day = 1; day <= WORKING_DAYS; day++) {
            int attendance = random.nextInt(3); // 0-Absent, 1-Part-time, 2-Full-time
            int dailyWage = 0;

            switch (attendance) {
                case 0:
                    System.out.println("Day " + day + ": " + employeeName + " is Absent");
                    break;
                case 1:
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
                    System.out.println("Day " + day + ": " + employeeName + " is Present (Part-Time), Wage = ₹" + dailyWage);
                    break;
                case 2:
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
                    System.out.println("Day " + day + ": " + employeeName + " is Present (Full-Time), Wage = ₹" + dailyWage);
                    break;
            }

            totalWage += dailyWage;
        }

        System.out.println("\nTotal Monthly Wage for " + employeeName + " = ₹" + totalWage);
        scanner.close();
    }
}

