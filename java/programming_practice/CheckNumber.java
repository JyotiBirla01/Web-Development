import java.util.Scanner;

public class CheckNumber {
    public void check(int n) {
        if (n > 0)
            System.out.println("The number is positive ");
        else
            System.out.println("The number is negative ");

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        CheckNumber obj = new CheckNumber();
        obj.check(n);

    }
}