import java.util.Scanner;

public class Ass05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first  number :-");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("The number after swapping is  " + a);
        System.out.println("The number after swapping is  " + b);
    }

}
