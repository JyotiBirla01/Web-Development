
// P is one-dimensional array of integers. Write a Java program search for a data VAL from P.
//  If VAL is present in the array then “element found ” otherwise “element not found” should be
//   displayed. 
import java.util.Scanner;

public class SearchData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the element to search");
        int x = sc.nextInt();
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Element found");
                flag = false;
            }
        }
        if (flag)
            System.out.println("Element not found");
    }
}