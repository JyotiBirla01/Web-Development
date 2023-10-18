
//9	99	999	9999	  99999 …….
import java.util.Scanner;

public class Ass31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");

        int n = sc.nextInt();
        int number = 9;
        for (int i = 1; i <= n; i++) {
            System.out.print(number + " ");
            number = number * 10 + 9;

        }
    }

}
