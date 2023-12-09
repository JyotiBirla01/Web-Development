//W.A.P to check whether given number is even or odd Without using % operator.

import java.util.Scanner;

public class Ass218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number :-");
        int a = sc.nextInt();

        if (a == (a / 2) * 2)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");

    }

}
