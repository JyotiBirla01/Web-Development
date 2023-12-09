
//Q.17 Print All Distinct Elements of a given integer array
// Given an integer array, print all distinct elements in an array. The given array 
// may contain duplicates and the output should print every element only once. 
// The given array is not sorted.
// Examples:
// Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
// Output: 12, 10, 9, 45, 2
//Q.17 Print All Distinct Elements of a given integer array
// Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
// Output: 12, 10, 9, 45, 2
import java.util.Scanner;

public class Ass17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        int i, j;
        System.out.println("Enter the elements in array ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Distinct element ");
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < i + 1; j++) {
                if (arr[i] == arr[j])
                    break;  
            }
            if (i == j)
                System.out.println(arr[i]);

        }
    }

}
