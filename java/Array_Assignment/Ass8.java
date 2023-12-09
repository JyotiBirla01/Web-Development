
//.Write a program to find the sum and product of all elements of an array.
import java.util.Scanner;

public class Ass8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int product = 1;
        int arr[] = new int[6];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        for (int i = 0; i < 6; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("The sum of array  is " + sum);
        System.out.println("The product of array is " + product);
    }

}
