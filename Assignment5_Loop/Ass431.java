import java.util.Scanner;

public class Ass431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        System.out.println("Enter the number ");
        int b = sc.nextInt();
        int gcd = 1, lcm = 1;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
            

        }
        System.out.println("Hcf is " + gcd);
    }

}
    

