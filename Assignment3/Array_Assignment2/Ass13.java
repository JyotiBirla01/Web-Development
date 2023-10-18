
// Q.13 Find the Rotation Count in Rotated Sorted array
// Given an array arr[] of size N having distinct numbers sorted in increasing 
// order and the array has been right rotated (i.e, the last element will be 
// cyclically shifted to the starting position of the array) k number of times, the 
// task is to find the value of k.
// Examples: 
// Input: arr[] = {15, 18, 2, 3, 6, 12}
// Output: 2
// Explanation: Initial array must be {2, 3, 6, 12, 15, 18}.
// We get the given array after rotating the initial array.
// (Using linear search): This problem can be solved using linear search.
// If we take a closer look at examples, we can notice that the number of 
// rotations is equal to the index of the minimum element. A simple linear 
// solution is to find the minimum element and returns its index.
// Illustration:
// Consider the array arr[]={15, 18, 2, 3, 6, 12};
// Initially minimum = 15, min_index = 0
// At i = 1: min = 15, min_index = 0
// At i = 2: min = min(2, 15) = 2, min_index = 2
// At i = 3: min = 2, min_index = 2
// At i = 4: min = 2, min_index = 2
// At i = 5: min = 2, min_index = 2
// The array is rotated twice to the righ
import java.util.Scanner;

public class Ass13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int s = sc.nextInt();
        int arr1[] = new int[s];

        int arr2[] = new int[s];

        int i, k;
        System.out.println("Enter the elements in array ");
        for (i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Rotate the array  ");
        for (i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int min = arr2[0];
        for (i = 0; i < arr2.length; i++) {
            if (arr2[i] < min) {
                min = arr2[i];

            }

        }

        for (i = 0; i < arr2.length; i++) {

            if (arr2[i] == min) {

                System.out.println("The value of k is " + i);
            }
        }

    }

}
