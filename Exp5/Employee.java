package Exp5;
import java.util.Scanner;

class EmployeeData {
    String name;
    double salary;

    void inputEmployee(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.next();

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
    }
}

class ManagerData extends EmployeeData {
    double bonus;

    void inputManager(Scanner sc) {
        inputEmployee(sc);

        System.out.print("Enter bonus: ");
        bonus = sc.nextDouble();
    }

    void displayManager() {
        System.out.println("\nManager Details");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }
}

class ClerkData extends EmployeeData {
    double allowance;

    void inputClerk(Scanner sc) {
        inputEmployee(sc);

        System.out.print("Enter allowance: ");
        allowance = sc.nextDouble();
    }

    void displayClerk() {
        System.out.println("\nClerk Details");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Allowance: " + allowance);
    }
}

public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ManagerData manager = new ManagerData();
        ClerkData clerk = new ClerkData();

        System.out.println("Enter Manager Details:");
        manager.inputManager(sc);

        System.out.println("\nEnter Clerk Details:");
        clerk.inputClerk(sc);

        manager.displayManager();
        clerk.displayClerk();

        sc.close();
    }
}