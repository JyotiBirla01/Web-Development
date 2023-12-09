import java.util.Scanner;

public class reverse101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 101; i <= 199; i++) {
            int num = i;
            int rev = 0;
            while (num != 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;

                num = num / 10;
            }
            System.out.println(rev);

        }
    }

}
