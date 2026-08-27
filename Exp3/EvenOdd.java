package Exp3;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        if (str.length() % 2 == 0)
            System.out.println("Length is Even");
        else
            System.out.println("Length is Odd");

        sc.close();
    }
}
