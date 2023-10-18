
//Q.12
// Find common elements in three sorted arrays.
// Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
// Note: can you take care of the duplicates without using any additional Data Structure?
// Example 1:
// Input:
// n1 = 6; A = {1, 5, 10, 20, 40, 80}
// n2 = 5; B = {6, 7, 20, 80, 100}
// n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
// Output: 20 80
// Explanation: 20 and 80 are the only
// common elements in A, B and C.
import java.util.Scanner;

public class Array13 {
    public void commonElements(int n1, int n2, int n3, int a1[], int a2[], int a3[]) {

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n3; k++) {

                    if ((a1[i] == a2[j]) && (a1[i] == a3[k]) && (a2[j] == a3[k]))
                        System.out.println(a1[i]);

                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1 ");
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter the " + (i + 1) + " element of array ");
            a1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of array2 ");
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.println("Enter the " + (i + 1) + " element of array ");
            a2[i] = sc.nextInt();
        }
        System.out.println("Enter the size of array3 ");
        int n3 = sc.nextInt();
        int a3[] = new int[n3];
        for (int i = 0; i < n3; i++) {
            System.out.println("Enter the " + (i + 1) + " element of array ");
            a3[i] = sc.nextInt();
        }
        System.out.println("Your output is ");
        Array13 obj = new Array13();
        obj.commonElements(n1, n2, n3, a1, a2, a3);

    }
}
