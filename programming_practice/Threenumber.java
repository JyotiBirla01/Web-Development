import java.util.Scanner;

public class Threenumber {
    public void check(int a, int b, int c) {
        if (a >= 20 && a < b && a < c)
            System.out.println(a);
        else if (b >= 20 && b < a && b < c)
            System.out.println(b);
        else if (c >= 20 && c < a && c < b)
            System.out.println(c);
        else
            System.out.println("No such number is present ");
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the second number ");
        int b = sc.nextInt();
        System.out.println("Enter the third number ");
        int c = sc.nextInt();
        Threenumber obj = new Threenumber();
        obj.check(a, b, c);

    }

}
