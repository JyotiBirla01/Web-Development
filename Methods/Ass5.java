//

import java.util.Scanner;

public class Ass5 {
    public void factorial(int n, int fact) {
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of number is " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int fact = 1;
        Ass5 obj = new Ass5();
        obj.factorial(n, fact);
    }
}