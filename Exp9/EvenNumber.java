package Exp9;
import java.util.Scanner;

public class EvenNumber {

    static void checkEven(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception("Number is not even!");
        }

        System.out.println("Number is even.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            checkEven(num);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
