public class SumRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 5;

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;   // add each number
        }

        System.out.println("Sum = " + sum);
    }
}