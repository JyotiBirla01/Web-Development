import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1");
        int n1 = sc.nextInt();
        System.out.println("Enter the size of array2");

        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        int arr3[] = new int[n1 + n2];
        System.out.println("Enter the elements in array1 ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();

        }
        System.out.println("Enter the elements in array2 ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();

        }
        System.out.println("After merging array");
        for (int i = 0, j = 0; i < arr3.length; i++) {
            if (i < n1) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[j];
                j++;
            }
            System.out.println(arr3[i]);
        }

    }

}
