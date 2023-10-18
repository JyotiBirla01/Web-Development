import java.util.Scanner;

public class Pattern {
    public void starPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");

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
        Pattern obj = new Pattern();
        obj.starPattern(n);

    }
}