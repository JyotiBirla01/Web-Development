
// 123456
// 54321
// 1234
// 321
// 12
// 1
import java.util.Scanner;

public class ReverseTriangle39 {
    public static void oddTriangle(int n) {

        for (int i = n; i >= 1; i--) {
            int p = i;
            int o = i;
            for (int j = 1; j <= i; j++) {

                if (o % 2 == 1) {
                    System.out.print(p);
                    p--;
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        oddTriangle(n);

    }

}
