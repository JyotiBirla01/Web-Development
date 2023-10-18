
//Q.6 Find occurance of an integer number in array.
import java.util.Scanner;

public class Array6 {
    public int occurence(int n, int arr[], int a) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == a) {
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number ");
        int a = sc.nextInt();

        Array6 obj = new Array6();
        int result = obj.occurence(n, arr, a);
        System.out.println(result);
    }

}
