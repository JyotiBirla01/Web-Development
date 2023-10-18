
//b) Write a loop that displays the contents of each element in the array that you declared
import java.util.Scanner;

class Ass12_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the array elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("The data you entered is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}