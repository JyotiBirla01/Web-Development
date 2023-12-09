import java.util.Scanner;

class Ass12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number :-");
        int number = sc.nextInt();
        int a = number / 1000;
        System.out.println(a);
        int b = (number / 100) % 10;
        System.out.println(b);
        int c = (number / 10) % 10;
        System.out.println(c);
        int d = number % 10;
        System.out.println(d);
        int reverse = (d * 1000) + (c * 100) + (b * 10) + a;
        System.out.println("The reverse of number is " + reverse);

    }
}