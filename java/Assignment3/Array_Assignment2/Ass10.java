
//Q.10 Check for Majority Element in a sorted array
import java.util.Scanner;

public class Ass10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the elements in array ");
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Number to be searched");
        int m = sc.nextInt();
        int c = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == m) {
                c++;
            }
        }
        System.out.println(c);
        if (c > s / 2)
            System.out.println(" True  " + m + " appears more than n/2 times in the given array");
        else
            System.out.println(" False  " + m + " doesn't appear more than n/2 times in the given array");

    }

}
