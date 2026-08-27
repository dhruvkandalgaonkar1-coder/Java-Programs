package Exp8;

import java.util.Scanner;

public class NestedTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            try {
                System.out.print("Enter divisor: ");
                int b = sc.nextInt();

                int result = a / b;
                System.out.println("Result = " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero.");
            }

            int arr[] = {10, 20, 30};

            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.println("Value = " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index is out of bounds.");
        }

        sc.close();
    }
}