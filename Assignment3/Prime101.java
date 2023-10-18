import java.util.Scanner;

public class Prime101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;

        for (i = 101; i <= 199; i++) {
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                }

            }
            if (j > (i / 2))
                System.out.println(i + "prime");

        }

    }

}