import java.util.Scanner;

public class Ass10_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                count++;

            }
        }
        System.out.println("The even  number in array :- " + count);

    }

}
