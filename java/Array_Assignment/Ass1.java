
//1 wap to define an array of integer of size 6 .Take input from user and display it in reverse 
//order.
import java.util.Scanner;

public class Ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the array elements ");
            arr[i] = sc.nextInt();
        }
        for (int i = 5; i > 0; i--) {
            System.out.println(" Array  element in reverse order " + arr[i]);
        }

    }

}
