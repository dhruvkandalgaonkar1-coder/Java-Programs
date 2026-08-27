package Exp4;
import java.util.Scanner;
public class EvenOddWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number as string: ");
        String str = sc.nextLine();
        Integer num = Integer.valueOf(str);
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd"); 
        sc.close();
    }
}
