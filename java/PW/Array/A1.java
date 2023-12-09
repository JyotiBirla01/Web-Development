import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int num : a) {
            System.out.println(num);
        }
    }

}
