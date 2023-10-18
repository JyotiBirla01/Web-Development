/*23. Write a Java program to find the sum and average of one dimensional integer array. */

import java.util.ArrayList;
import java.util.Scanner;

public class Ass23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store the elements
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.print("Enter the number of elements for the ArrayList: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements for the ArrayList:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            arrayList.add(element);
        }

        // Calculate the sum of elements
        int sum = 0;
        for (int element : arrayList) {
            sum += element;
        }

        // Calculate the average
        double average = (double) sum / n;

        System.out.println("Sum of elements in the ArrayList: " + sum);
        System.out.println("Average of elements in the ArrayList: " + average);

        
    }
}
