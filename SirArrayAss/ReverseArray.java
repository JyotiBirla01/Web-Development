
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 9, 8, 6, 7, 2 };
        int temp;

        for (int i = 0; i < arr.length / 2; i++) {

            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
        System.out.println(" Array  element in reverse order is  ");
        for (int j = 0; j < arr.length; j++) {

            System.out.print(arr[j] + " ");
        }

    }

}
