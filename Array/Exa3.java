import java.util.Scanner;

public class Exa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int sum = 1;
        int arr[] = new int[5];
        for (i = 0; i < 5; i++) {
            System.out.println("Enter the number ");
            arr[i] = sc.nextInt();
        }
        for (i = 1; i < 5; i++) {
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }

        System.out.println("The sum of number is " + sum);

    }

}
