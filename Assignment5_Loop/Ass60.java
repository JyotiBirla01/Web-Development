
// WAP to print Square, Cube and Square Root of all numbers from 1 to N
import java.util.Scanner;

public class Ass60 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int s = 0, c = 0;
        double sr = 0;
        for (int i = 1; i < n + 1; i++) {
            s = i * i;
            c = i * i * i;
            sr = Math.sqrt(i);

        }
        System.out.println("Square of a number is " + s);
        System.out.println("cube  of a number is " + c);
        System.out.println("Squareroot of a number is " + sr);

    }
}
