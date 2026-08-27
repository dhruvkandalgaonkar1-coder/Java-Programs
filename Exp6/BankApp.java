package Exp6;

import java.util.Scanner;

// Helper Account Class
class Account {
    String name;
    double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited: " + amt);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrew: " + amt);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance for " + name + ": " + balance);
    }
}

// Main Class
public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Account 1 Input
        System.out.println("--- Enter Details for Account 1 ---");
        System.out.print("Enter Name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal1 = sc.nextDouble();
        Account a1 = new Account(name1, bal1);

        // Account 1 Operations
        System.out.print("Enter amount to deposit into " + name1 + "'s account: ");
        double dep1 = sc.nextDouble();
        a1.deposit(dep1);

        System.out.print("Enter amount to withdraw from " + name1 + "'s account: ");
        double w1 = sc.nextDouble();
        a1.withdraw(w1);

        a1.checkBalance();

        sc.nextLine(); // Clear buffer

        // Account 2 Input
        System.out.println("\n--- Enter Details for Account 2 ---");
        System.out.print("Enter Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal2 = sc.nextDouble();
        Account a2 = new Account(name2, bal2);

        // Account 2 Operations
        System.out.print("Enter amount to withdraw from " + name2 + "'s account: ");
        double w2 = sc.nextDouble();
        a2.withdraw(w2);

        a2.checkBalance();

        sc.close();
    }
} 