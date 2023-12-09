
//24. Write a Java program to swap first and last element of an integer 1-d array.
import java.util.Scanner;

class SwapIstAndLast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int temp;
        temp = arr[0];
        arr[0] = arr[n - 1];
        arr[n - 1] = temp;
        System.out.println("After Swapping 1st and lasat element of array");
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }

    }
}