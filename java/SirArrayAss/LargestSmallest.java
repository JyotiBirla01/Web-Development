
//Write a Java program to find the largest and smallest element of an array.
import java.util.Scanner;

class LargestSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumeven = 0, sumodd = 0;
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
            if (arr[i] < smallest)
                smallest = arr[i];

        }
        System.out.println("Largest element  of array is : " + largest);

        System.out.println("Smallest element  of array is : " + smallest);

    }
}