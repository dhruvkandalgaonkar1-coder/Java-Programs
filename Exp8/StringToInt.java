package Exp8;

import java.util.Scanner;

public class StringToInt {
    static void convert(String str) {
        try {
            int num = Integer.parseInt(str); 
            System.out.println("Converted number = " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: The input is not a valid number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String str = sc.nextLine();

        convert(str);

        sc.close();
    }
}
