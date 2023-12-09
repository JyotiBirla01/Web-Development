//Java program to check whether the triangle is valid or not if angles are given. Hint:-
// The angle property of the triangle says that the sum of all three angles should be equal to 180. 

import java.util.Scanner;

public class Ass221 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first angle    ");
        int angle1 = sc.nextInt();
        System.out.println("Enter the second angle    ");
        int angle2 = sc.nextInt();
        System.out.println("Enter the third  angle    ");
        int angle3 = sc.nextInt();
        if ((angle1 + angle2 + angle3) == 180)
            System.out.println("Valid Triangle ");
        else
            System.out.println("Invalide Triangle ");

    }

}
