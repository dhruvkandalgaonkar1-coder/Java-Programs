package Exp1;
public class StarPattern {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {     // rows
            for (int j = 1; j <= i; j++) { // stars in each row
                System.out.print("*");
            }
            System.out.println();
        }
    }
}