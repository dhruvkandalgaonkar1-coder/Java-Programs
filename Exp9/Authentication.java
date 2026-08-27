package Exp9;
import java.util.Scanner;

public class Authentication {

    static void checkPassword(String password) throws Exception {
        if (!password.equals("admin123")) {
            throw new Exception("Authentication Failure!");
        }

        System.out.println("Authentication Successful!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            checkPassword(password);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}