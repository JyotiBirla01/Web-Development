
//Q.11 K-th Element of Two Sorted Arrays
import java.util.Scanner;

public class Ass11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1 ");
        int s1 = sc.nextInt();
        System.out.println("Enter the size of array2 ");
        int s2 = sc.nextInt();
        int arr1[] = new int[s1];
        int arr2[] = new int[s2];
        int arr3[] = new int[s1 + s2];
        System.out.println("Enter the elemnts in  array1   ");
        int i = 0, j = 0;
        for (i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the  elements in  array2  ");
        for (i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Enter the k th position ");
        int k = sc.nextInt();

        for (i = 0, j = 0; i < arr3.length; i++) {

            if (i < s1) {

                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[j];
                j++;
            }
        }
        for (i = 0; i < arr3.length; i++) {
            for (j = i + 1; j < arr3.length; j++) {
                if (arr3[i] > arr3[j]) {
                    int temp = 0;
                    temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }

            System.out.println(arr3[i]);

        }
        System.out.println("The kth element of this array is ");
        for (i = 0; i < arr3.length; i++) {
            if (k == arr3[i])
                System.out.println(arr3[i]);

        }
    }
}