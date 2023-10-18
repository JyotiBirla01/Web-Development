import java.util.Scanner;

class Magical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int rem, rem1 = 0, sum = 0;

        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            sum = sum + rem;

        }
        // System.out.println(sum);
        int sum1 = 0;
        while (sum != 0) {
            rem1 = sum % 10;
            sum = sum / 10;
            sum1 = sum1 + rem1;

        }
        // System.out.println(sum1);

        if (sum1 == 1) {
            System.out.println("magical number");
        } else {
            System.out.println("Not magical");
        }
    }
}
