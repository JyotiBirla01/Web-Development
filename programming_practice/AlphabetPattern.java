import java.util.Scanner;

public class AlphabetPattern {
    public void pattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) +(j + 64));

            }
            System.out.println();
        }

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        AlphabetPattern obj = new AlphabetPattern();
        obj.pattern(n);

    }
}
