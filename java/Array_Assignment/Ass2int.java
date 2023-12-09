import java.util.Scanner;

public class Ass2int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                System.out.println(arr[i] + " Found");
            else
                System.out.println(arr[i] + " not found ");
        }

    }

}
