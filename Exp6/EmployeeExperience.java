package Exp6;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EmployeeExperience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Joining Date (dd-MM-yyyy): ");
        String joinStr = sc.nextLine();

        // Date processing using java.time package
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate joinDate = LocalDate.parse(joinStr, formatter);
        LocalDate today = LocalDate.now();

        // Calculate period difference
        Period diff = Period.between(joinDate, today);

        // Output
        System.out.println("\nEmployee: " + name);
        System.out.println("Joining Date: " + joinDate.format(formatter));
        System.out.println("Experience: " + diff.getYears() + " Years, " 
    + diff.getMonths() + " Months, " 
    + diff.getDays() + " Days");
    sc.close();
    }
}