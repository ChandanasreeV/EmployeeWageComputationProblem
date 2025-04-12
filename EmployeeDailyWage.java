package WageComputation;

import java.util.Scanner;
import java.util.Random;

public class EmployeeDailyWage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Constants
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;

        // Take employee name as input
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        // Randomly check attendance
        int attendance = random.nextInt(2); // 0 = Absent, 1 = Present

        if (attendance == 1) {
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println(employeeName + " is Present");
            System.out.println("Daily Wage = ₹" + dailyWage);
        } else {
            System.out.println(employeeName + " is Absent");
            System.out.println("Daily Wage = ₹0");
        }

        scanner.close();
    }
}
