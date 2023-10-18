
// Q.12 Find the number of zeroes
// Given an array of 1s and 0s which has all 1s first followed by all 0s. Find the 
// number of 0s. Count the number of zeroes in the given array.
// Examples :
// Input: arr[] = {1, 1, 1, 1, 0, 0}
// Output: 2
import java.util.Scanner;

public class Ass12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                c++;

        }
        System.out.println("The number of Zeros  " + c);
    }

}
