import java.util.Scanner;

public class SpecificPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the element which you want to insert  ");
        int x = sc.nextInt();
        System.out.println("Enter the position   ");
        int p = sc.nextInt();
        arr[p] = x;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }

}
