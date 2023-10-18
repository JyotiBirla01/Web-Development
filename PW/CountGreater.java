
//Count the number of elements Strictly greater than value  x in given array .
import java.util.Scanner;

public class CountGreater {
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
        System.out.println("The number of  element is ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x)
                count++;

        }
        System.out.println(count);

    }

}
