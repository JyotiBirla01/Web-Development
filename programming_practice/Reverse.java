import java.util.Scanner;

class Reverse {
    public void m1(int n) {
        int rev = 0, rem;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        System.out.println(rev);
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        Reverse obj = new Reverse();
        obj.m1(n);

    }
}