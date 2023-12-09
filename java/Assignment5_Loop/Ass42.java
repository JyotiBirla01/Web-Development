//WAP to find out HCF of a number

import java.util.Scanner;

public class Ass42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int hcf = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                hcf = i;

        }
        System.out.println("HCF is " + hcf);
    }
}
