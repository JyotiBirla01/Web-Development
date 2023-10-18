import java.util.Scanner;

public class Ass421 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        System.out.println("Enter the number ");
        int b = sc.nextInt();
        int gcd = 1, lcm = 1;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0)
                lcm = i;
            lcm = (a * b) / lcm;

        }
        System.out.println("LCM is " + lcm);
    }

}
