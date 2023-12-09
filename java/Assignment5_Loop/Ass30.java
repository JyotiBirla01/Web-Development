//1+11+111+1111+11111+…

import java.util.Scanner;

public class Ass30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int number = 1, sum = 0;
        ;
        for (int i = 1; i <= n; i++) {

            System.out.print(number + " ");
            number = number * 10 + 1;
            sum = sum + number;
        }
        System.out.println("\nSum is " + sum);

    }

}
