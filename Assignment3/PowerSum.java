import java.util.Scanner;

public class PowerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of x");
        float x = sc.nextInt();
        double sum = 0;
        for (float i = 1; i <= n; i++) {
            double total = 1 / (Math.pow(x, i));
            sum = sum + total;
        }
        System.out.println(sum);
    }

}
