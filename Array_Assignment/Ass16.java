
//Q.16 Write a Java program to calculate the average value of array element
import java.util.Scanner;

public class Ass16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, average = 0;
        int arr[] = new int[5];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
            average = sum / arr.length;
        }
        System.out.println("The average of array is " + average);

    }

}
