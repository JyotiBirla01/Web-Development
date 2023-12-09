
// WAP to print tables of all the numbers between two entered numbers
import java.util.Scanner;

public class Ass47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start  number ");
        int start = sc.nextInt();
        System.out.println("Enter the  end number ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " =" + (i * j));

            }

        }
        // System.out.println(table);
    }

}
