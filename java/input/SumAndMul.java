
import java.util.Scanner;

public class SumAndMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :-");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :-");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is :-" + sum);
        int pro = num1 * num2;
        System.out.println("Product is:- " + pro);
        System.out.println("The addition of sum and product is :-" + (sum + pro));

    }

}
