
//Suppose a one-dimensional array AR containing integers is arranged in ascending order. 
//Write a java program to search for an integer from AR with the help of Binary search method, 
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in  array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("Enter the element to be search");
        int x = sc.nextInt();
        int low = 0, mid, high = n - 1;
        boolean flag = false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == a[mid]) {
                flag = true;
                break;
            } else if (x > a[mid])
                low = mid + 1;
            else
                high = mid - 1;

        }
        if (flag)
            System.out.println("Element found ");
        else
            System.out.println("Element not found ");

    }
}