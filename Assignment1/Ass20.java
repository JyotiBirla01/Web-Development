import java.util.Scanner;

public class Ass20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  value of a :-");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :- ");
        int b = sc.nextInt();
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("The value of a after swapping " + a);
        System.out.println("The value of b after swapping " + b);

    }

}