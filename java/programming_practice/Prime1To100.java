import java.util.Scanner;

public class Prime1To100 {
    public void check() {
        int i, j;
        for (i = 1; i <= 100; i++) {
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                }

            }
            if (i > 1 && j > i / 2) {
                System.out.println(i);
            }
        }

    }

}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Prime1To100 obj = new Prime1To100();
        obj.check();

    }
}