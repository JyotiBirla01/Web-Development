//WAP to check whether entered number is Armstrong or not

import java.util.Scanner;

public class Ass38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int a = n;
        int cube, rem, sum = 0;
        while (n != 0) {
            rem = n % 10;
            cube = rem * rem * rem;
            sum = sum + cube;
            n = n / 10;
        }
        System.out.println(sum);
        if (a == sum)
            System.out.println("Armstrong number ");
        else
            System.out.println("Not Armstrong");

    }

}
