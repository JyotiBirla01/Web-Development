
//Write a java program to implement linear search
import java.util.Scanner;

public class Array34 {
    public static void linearSearch(int n, int a[], int element) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (element == a[i]) {
                flag = true;
                break;

            }
        }
        if (flag)
            System.out.println("Element found ");
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
        Array34 obj = new Array34();
        obj.linearSearch(n, a, element);

    }
}