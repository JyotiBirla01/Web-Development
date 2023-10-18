
//46) WAP to find out the sum of first and last digit of a user entered number
import java.util.Scanner;

public class Ass46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int sum = 0, rem = 0, lastNum = 0;
        int firstNum = 0;
        while (n != 0) {
            rem = n % 10;
            lastNum = rem;
            break;
        }

        while (n != 0) {
            rem = n % 10;
            n = n / 10;
        }

        firstNum = rem;
        sum = (firstNum + lastNum);

        System.out.println(sum);

    }

}
