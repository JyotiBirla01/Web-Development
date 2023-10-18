
//A	b	C	d	E	f	G	h	…… n terms
import java.util.Scanner;

public class Ass32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        char u = 65, l = 98;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(u + " ");
                u += 2;

            } else {
                System.out.print(l + " ");
                l += 2;

            }
        }
    }

}
