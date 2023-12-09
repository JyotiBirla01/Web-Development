//Program to perform arithmetic operation using switch case

import java.util.Scanner;

class Ass213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  first Number  ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second Number  ");
        int n2 = sc.nextInt();
        System.out.println("Enter the operator ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;

            case '%':
                System.out.println(n1 % n2);
                break;

            default:
                System.out.println("Invalide Operator ");

        }

    }

}
