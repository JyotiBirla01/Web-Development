import java.util.Scanner;

public class Factorial {
    public int check(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {

            fact = fact * i;
        }
        return fact;
    }

}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();

        Factorial obj = new Factorial();
        int ans = obj.check(number);
        System.out.println(ans);

    }
}