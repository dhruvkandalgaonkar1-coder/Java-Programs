package Exp6;

import java.util.Scanner;

public class useme {

    Scanner sc = new Scanner(System.in);

    public void area() {
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double area = 3.14 * r * r;
        System.out.println("Area of Circle = " + area);
    }

    public void salary() {
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;  
        double da = basic * 0.10;    

        double total = basic + hra + da;

        System.out.println("Total Salary = " + total);
    }

    public void percentage() {
        System.out.print("Enter marks of 5 subjects: ");

        double total = 0;
        for (int i = 1; i <= 5; i++) {
            total += sc.nextDouble();
        }

        double per = total / 5;

        System.out.println("Percentage = " + per + "%");
    }
}

// Non-public main execution class in the same file
class Main {
    public static void main(String[] args) {
        useme obj = new useme();

        obj.area();
        obj.salary();
        obj.percentage();
    }
}