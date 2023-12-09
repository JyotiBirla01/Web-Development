
//Q.7 Wap to Insert an element at a specific position in an Array in Java
import java.util.Scanner;

public class Ass7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int s = sc.nextInt();
        System.out.println("Enter the elements in array ");
        int i = 0;
        int arr[] = new int[s];
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("Enter the element which you want to insert ");
        int x = sc.nextInt();
        System.out.println("Enter the position ");
        int p = sc.nextInt();
        arr[p] = x;
        for (i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }

}
