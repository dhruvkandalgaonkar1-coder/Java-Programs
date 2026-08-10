import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "admin123";

        System.out.print("Enter Password: ");
        String input = sc.nextLine();

        if (password.equals(input)) {
            System.out.println("Password Correct");
        } else {
            System.out.println("Wrong Password");
        }

        sc.close();
    }
}
