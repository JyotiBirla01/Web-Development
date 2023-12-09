import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the element which you want to delete  ");
        int x = sc.nextInt();
        System.out.println("Your deleted element is ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                continue;
            System.out.println(arr[i]);

        }

    }

}
