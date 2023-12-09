import java.util.Scanner;

public class Ass13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out.println(" Natural number in reverse order is  ");
        for (int i = n; i >= 1; i--) {

            System.out.println(i);
        }
    }

}
