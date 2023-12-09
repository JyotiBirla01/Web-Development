
// Q.8 Java Program to Increment All Element of an Array by One
// Examples:
// Input : arr1[] = {50, 25, 32, 12, 6, 10, 100, 150}
// Output: arr1[] = {51, 25, 33, 13, 7, 11, 101, 151}
// Input : arr2[] = {3, 6, 8, 12, 45}
// Output: arr2[] = {4, 7, 9, 13, 46
import java.util.Scanner;

public class Ass8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("After incrementing all elements ");
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i] + 1);
        }
    }
}
