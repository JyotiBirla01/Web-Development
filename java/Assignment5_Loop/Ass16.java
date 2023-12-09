
import java.util.Scanner;

public class Ass16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int total;
        for (int i = (-(n / 2)); i <= (n / 2); i++) {

            total = i * 3;
            System.out.print(" " + total);

        }
    }

}
