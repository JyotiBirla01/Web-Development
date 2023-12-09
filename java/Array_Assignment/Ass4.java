//4 wap to print max and minimum value in given array.

import java.util.Scanner;

public class Ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter the Number ");
        for (int i = 0; i < 5; i++) {

            arr[i] = sc.nextInt();
        }
        int max = 0;
        int min = arr[0];
        for (int i = 0; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
            }
            min = arr[i];

        }
        System.out.println("The minimum number is :- " + min);
        System.out.println("The maximum number is :- " + max);

    }

}
