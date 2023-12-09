
//Q.9 Find a peak element which is not smaller than its neighbours

import java.util.Scanner;

public class Ass9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < s - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                System.out.println("The peak element is  " + arr[i]);
        }

        if (arr[0] > arr[1])
            System.out.println(arr[0]);
        if (arr[s - 1] > arr[s - 2])
            System.out.println(arr[s - 1]);

    }

}s