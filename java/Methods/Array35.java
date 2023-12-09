
//Write a java program to implement selection sort algoritm
import java.util.Scanner;

public class Array35 {
    public int[] selectionSort(int n, int a[]) {
        for (int i = 0; i < a.length; i++) {
            int smallest = i;
            for (int j = 0; j < a.length; j++) {
                if (a[smallest] > a[j])
                    smallest = j;
            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }
        return a;
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
        Array35 obj = new Array35();
        int result[] = obj.selectionSort(n, a);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
