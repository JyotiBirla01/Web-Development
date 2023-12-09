
//33. Write a java program to impelment binary search algorithm
import java.util.Scanner;

public class Array33 {
    public void binarySearch(int n, int a[], int element) {
        int low = 0, high = n - 1, mid = 0;
        boolean flag = false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (element == a[mid]) {
                flag = true;
                break;
            } else if (element > a[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        if (flag)
            System.out.println("Element found");
        else
            System.out.println("Element not found ");

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in array in sorted order");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched ");
        int element = sc.nextInt();
        Array33 obj = new Array33();
        obj.binarySearch(n, a, element);

    }
}