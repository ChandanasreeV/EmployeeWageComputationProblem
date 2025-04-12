package WageComputation;

import java.util.Random;
import java.util.Scanner;

public class EmployeeAttendance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take employee name as input
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        // Generate random attendance
        Random random = new Random();
        int attendance = random.nextInt(2); // 0 or 1

        // Display attendance status
        if (attendance == 1) {
            System.out.println(employeeName + " is Present");
        } else {
            System.out.println(employeeName + " is Absent");
        }

        scanner.close();
    }
}
