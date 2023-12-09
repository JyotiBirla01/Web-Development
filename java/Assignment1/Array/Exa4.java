import java.util.Scanner;

public class Exa4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 1; i < 10; i++) {
            System.out.println("Enter the number ");
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < 10; i++) {
            System.out.println(a[i]);
            System.out.println(" length of array is " + (a.length));

        }

    }

}
