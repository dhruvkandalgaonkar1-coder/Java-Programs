package Exp4;
import java.util.Scanner;
public class LargestNumberWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second number: ");
        String s2 = sc.nextLine();
        System.out.print("Enter third number: ");
        String s3 = sc.nextLine();
        Integer n1 = Integer.valueOf(s1);
        Integer n2 = Integer.valueOf(s2);
        Integer n3 = Integer.valueOf(s3);
        int largest = n1;
        if (n2 > largest)
            largest = n2;
        if (n3 > largest)
            largest = n3;
        System.out.println("Largest Number = " + largest);
        sc.close();
    }
} 
