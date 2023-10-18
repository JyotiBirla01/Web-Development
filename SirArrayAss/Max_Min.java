import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];

        }
        System.out.println("Maximum value is " + max);
        System.out.println("Minimum value is " + min);

    }

}
