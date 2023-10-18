
//.15 Find Second largest element in an array
import java.util.Scanner;

// Find Second largest element in an array
// Given an array of integers, our task is to write a program that efficiently finds 
// the second-largest element present in the array.
// Example:
// Input: arr[] = {12, 35, 1, 10, 34, 1}
// Output: The second largest element is 34.
// Explanation: The largest element of the 
// array is 35 and the second
public class Ass15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the elements in array ");
        int i, j = 0;
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        int temp = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(" The second largest does not exist.");
                    break;
                } else {
                    System.out.println("The  Second largest element in an array is " + arr[1]);
                    break;
                }
            }
        }
    }
}
