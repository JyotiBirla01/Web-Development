
//10.Take 20 integer inputs from user and print the following:
//  number of positive numbers
//  number of negative numbers
//  number of odd numbers
//  number of even numbers
//  number of 0s.
import java.util.Scanner;

public class Ass10_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int c = 0, n = 0, e = 0, o = 0, z = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {

                c++;
            }
            if (arr[i] < 0) {
                n++;
            }
            if (arr[i] % 2 == 0) {

                e++;

            }
            if (arr[i] % 2 != 0) {

                o++;

            }
            if (arr[i] == 0) {

                z++;

            }

        }
        System.out.println("The positive number in array :- " + c);
        System.out.println("The negaitive number in array :- " + n);
        System.out.println("The even  number in array :- " + e);
        System.out.println("The odd  number in array :- " + o);
        System.out.println("The zero   number in array :- " + z);
    }

}
