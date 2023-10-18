import java.util.Scanner;

public class Ass37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int p = n;
        int rev = 0, rem;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        System.out.println(rev);

        if (p == rev)
            System.out.println("The nummber is Pallindrom");
        else
            System.out.println("The number is not Pallindrom");

    }

}
