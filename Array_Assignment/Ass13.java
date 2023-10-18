//13. Write a program to array elements to print sum of Cubic Values

import java.util.Scanner;

public class Ass13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int cube, sum = 0;
        System.out.println("The data you entered ");
        for (int i = 0; i < arr.length; i++) {
            cube = arr[i] * arr[i] * arr[i];
            sum += cube;
        }
        System.out.println(sum);
    }

}
