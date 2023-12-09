
//Count the occurence of particular element x in given array .
import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i + 1])
                check = true;
            break;
        }
        System.out.println("Is sorted " + check);

    }

}
