import java.util.Scanner;
public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as string: ");
        String str = sc.nextLine();
        Integer num = Integer.valueOf(str);
        System.out.println("Original String : " + str);
        System.out.println("Wrapper Object  : " + num);
        System.out.println("Primitive Value : " + num.intValue());
        sc.close();
    }
}
