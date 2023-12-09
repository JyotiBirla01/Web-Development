//WAP to count no. Of even and odd digits in a number

import java.util.Scanner;

public class Ass40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int evenCount = 0, oddCount = 0, rem;
        while (n != 0) {
            rem = n % 10;
            if (rem % 2 == 0)
                evenCount++;

            else
                oddCount++;
            n = n / 10;
        }
        System.out.println("Even number in digit is " + evenCount);
        System.out.println("Odd number in digit is " + oddCount);
    }

}
