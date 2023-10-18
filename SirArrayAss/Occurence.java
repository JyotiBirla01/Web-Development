
//Find the  Occurence of interger number in a given array 
import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the element which you want to count  ");
        int x = sc.nextInt();
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)

                c++;
        }
        System.out.println("The occurence of " + x + " is " + c);

    }

}
