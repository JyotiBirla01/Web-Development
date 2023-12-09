import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        float sum = 0;
        for (float i = 1; i <= n; i++) {
            float total = (1 / i);
            System.out.println(i + "   " + total);
            sum = sum + total;

        }
        System.out.println(sum);
    }

}
