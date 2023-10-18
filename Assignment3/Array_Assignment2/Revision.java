import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q.1 Write a program to make a Jagged Array .

        // System.out.println("Enter the rows");
        // int r = sc.nextInt();
        // int arr[][] = new int[r][];
        // System.out.println("Enter columns ");
        // for (int i = 0; i < arr.length; i++) {
        // int c = sc.nextInt();
        // System.out.println("Enter size of col");
        // arr[i] = new int[c];

        // }
        // System.out.println("Enter elements ");
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // System.out.println("Jagged array ");
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(" " + arr[i][j]);
        // }
        // System.out.println();
        // }

        // .2 Write a program for Sorting an array .

        // System.out.println("Enter the size of array ");
        // int s = sc.nextInt();
        // int arr[] = new int[s];
        // System.out.println("Enter elements ");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();

        // }
        // int i, j;
        // for (i = 0; i < arr.length; i++) {
        // for (j = i + 1; j < arr.length; j++) {
        // if (arr[i] > arr[j]) {
        // int temp;
        // temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }

        // }
        // System.out.println("sorted array " + arr[i]);
        // }
        // Q.3 Write a program for Swapping Two Array
        // System.out.println("Enter the size of array ");
        // int s1 = sc.nextInt();
        // int arr1[] = new int[s1];
        // System.out.println("Enter the size of array ");
        // int s2 = sc.nextInt();
        // int arr2[] = new int[s2];
        // System.out.println("Enter elements 1");
        // for (int i = 0; i < arr1.length; i++) {
        // arr1[i] = sc.nextInt();

        // }
        // System.out.println("Enter elements 2");
        // for (int i = 0; i < arr2.length; i++) {
        // arr2[i] = sc.nextInt();

        // }
        // int i, j;
        // for (i = 0; i < arr1.length; i++) {
        // for (j = 0; j < arr2.length; j++) {

        // int temp;
        // temp = arr1[i];
        // arr1[i] = arr2[j];
        // arr2[j] = temp;

        // }

        // }
        // for (i = 0; i < arr1.length; i++) {
        // System.out.println("Swapping " + arr1[i]);
        // }
        // for (i = 0; i < arr2.length; i++) {
        // System.out.println("Swapping " + arr2[i]);
        // }
        // //Q.4 Write a Java program to swap first and last element of an integer 1-d
        // array.
        // System.out.println("Enter the size of array ");
        // int s = sc.nextInt();
        // int arr[] = new int[s];
        // System.out.println("Enter elements ");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();

        // }
        // System.out.println("After Swapping first and last element ");
        // for (int i = 0; i < arr.length; i++) {

        // int temp = 0;
        // temp = arr[0];
        // arr[0] = arr[s - 1];
        // arr[s - 1] = temp;

        // System.out.println(arr[i]);

        // }
        // System.out.println("Enter the size of array ");
        // int s1 = sc.nextInt();
        // int arr1[] = new int[s1];
        // System.out.println("Enter the size of array ");
        // int s2 = sc.nextInt();
        // int arr2[] = new int[s2];
        // System.out.println("Enter elements 1");
        // for (int i = 0; i < arr1.length; i++) {
        // arr1[i] = sc.nextInt();

        // }
        // System.out.println("Enter elements 2");
        // for (int i = 0; i < arr2.length; i++) {
        // arr2[i] = sc.nextInt();
        // }
        // int c = 0;
        // for (int i = 0; i < arr1.length; i++) {
        // for (int j = 0; j < arr2.length; j++) {
        // if (arr1[i] == arr2[j])
        // c++;
        // }
        // }
        // if (c == s1)
        // System.out.println("equal ");
        // else
        // System.out.println("Not ");
        // .6 Find a missing number in an array
        // System.out.println("Enter the size of array ");
        // int s = sc.nextInt();
        // int arr[] = new int[s];
        // System.out.println("Enter elements ");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();

        // }
        // int total = s * (s + 1) / 2;
        // int sum = 0;
        // for (int i = 0; i < arr.length - 1; i++) {
        // sum = sum + arr[i];
        // }
        // System.out.println(total);
        // System.out.println(sum);
        // System.out.println("Missing number " + (total - sum));
        //// Q.7 Wap to Insert an element at a specific position in an Array in Java
        // System.out.println("Enter the size of array ");
        // int s = sc.nextInt();
        // int arr[] = new int[s];
        // System.out.println("Enter elements ");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();

        // }
        // System.out.println("Enter the numebr to be inserted");
        // int x = sc.nextInt();
        // System.out.println("Enter the position");
        // int p = sc.nextInt();
        // for (int i = 0; i < arr.length; i++) {
        // arr[p] = x;
        // System.out.println(arr[i]);
        // }
        // Q.8 Java Program to Increment All Element of an Array by One
        // Examples:
        // Input : arr1[] = {50, 25, 32, 12, 6, 10, 100, 150}
        // Output: arr1[] = {51, 25, 33, 13, 7, 11, 101, 151}
        // Input : arr2[] = {3, 6, 8, 12, 45}
        // Output: arr2[] = {4, 7, 9, 13, 46
        // System.out.println("Enter the size of array ");
        // int s = sc.nextInt();
        // int arr[] = new int[s];
        // System.out.println("Enter elements ");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();

        // }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i] + 1);
        // }
        // .9 Find a peak element which is not smaller than its neighbours
        // System.out.println("Enter the size of array ");
        // int s = sc.nextInt();
        // int arr[] = new int[s];
        // System.out.println("Enter elements ");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();

        // }
        // for (int i = 1; i < arr.length - 1; i++) {
        // if ((arr[i] > arr[i - 1]) && (arr[i] > arr[i + 1]))
        // System.out.println(arr[i]);
        // }
        // if (arr[s - 1] > arr[s - 2])
        // System.out.println(arr[s - 1]);
        // if (arr[0] > arr[1])

        // System.out.println(arr[0]);

        // Q.10 Check for Majority Element in a sorted array
        // System.out.println("Enter the size of array ");
        // int s = sc.nextInt();
        // int arr[] = new int[s];
        // System.out.println("Enter elements ");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();

        // }
        // System.out.println("Enter the number ");
        // int m = sc.nextInt();
        // int c = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == m)
        // ;
        // c++;
        // }
        // if (m > s / 2)
        // System.out.println("true");
        // else
        // System.out.println("false");
        // Q.11 K-th Element of Two Sorted Arrays
        System.out.println("Enter the size of array ");
        int s1 = sc.nextInt();
        System.out.println("Enter the size of array2 ");
        int s2 = sc.nextInt();
        int arr1[] = new int[s1];
        int arr2[] = new int[s2];
        int arr3[] = new int[s1 + s2];
        System.out.println("Enter elements ");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();

        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = sc.nextInt();

        }
        for (int i = 0, j = 0; i < arr3.length; i++) {
            if (arr3[i] > s1) {
                System.out.println(arr3[i]);
            } else {
                System.out.println(arr3[j]);
                j++;
            }

        }
    }

}
