
//44) WAP to interchange first and last digit of a number
import java.util.Scanner;

public class Ass44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int temp = n;
        int rem, count = 0, rev = 0, digit;
        while (temp != 0) {
            rem = temp % 10;

            count++;
            temp /= 10;

        }
        int a = n % 10;
        n = n / 10;
        int d = count - 2;
        int divide = 1;
        for (int i = 1; i <= d; i++) {
            divide = divide * 10;
        }
        int c = n % divide;
        int b = n / divide;
        digit = (a * divide + c) * 10 + b;
        System.out.println(digit);
    }

}
