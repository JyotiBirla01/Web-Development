
//Write a Java program to input day number and print week day. 
import java.util.Scanner;

public class Ass223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int days = sc.nextInt();
        System.out.println("Weeks in " + days + "  days is " + days / 7);

    }

}
