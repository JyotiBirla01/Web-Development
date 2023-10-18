import java.util.Scanner;

public class SumofSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base ");
        int x = sc.nextInt();
        System.out.println("Enter the exponenet");
        int y = sc.nextInt();

        double result = 1, sum = 0;
        for (int i = 1; i <= y; i++) {
            result = (result * x);
            sum = sum + (1 / result);

        }
        System.out.println(result);
        System.out.println(sum);

    }

}
