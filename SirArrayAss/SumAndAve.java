
//23. Write a Java program to find the sum and average of one dimensional integer array. 
import java.util.Scanner;

class SumAndAve {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int sum = 0, average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            average = sum / n;
        }
        System.out.println("Sum of array is : " + sum);

        System.out.println("Average of array is : " + average);

    }
}