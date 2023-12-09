// 49)	WAP to find out all the perfect numbers between two entered numbers

import java.util.Scanner;

public class Ass49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the second number");
        int lastNum = sc.nextInt();
        int sum, i, j;

        for (i = firstNum; i <= lastNum; i++) {

            for (j = 1, sum = 0; j <= (i / 2); j++) {
                if (i % j == 0) {

                    sum = sum + j;

                }
            }

            if (sum == i)
                System.out.println(i + " Perfect");

        }
    }
}
