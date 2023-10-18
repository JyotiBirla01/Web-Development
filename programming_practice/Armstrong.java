import java.util.Scanner;

public class Armstrong {
    public void check(int n) {
        int rem, cube = 1, sum = 0;
        int copy = n;
        while (n != 0) {
            rem = n % 10;

            cube = rem * rem * rem;
            sum = sum + cube;
            n = n / 10;
        }

        if (copy == sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        Armstrong obj = new Armstrong();
        obj.check(n);

    }
}