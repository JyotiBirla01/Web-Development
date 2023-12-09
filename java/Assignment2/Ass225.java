
//Write a Java program to calculate profit or loss
import java.util.Scanner;

public class Ass225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price");
        int cp = sc.nextInt();
        System.out.println("Enter the Selling Price");
        int sp = sc.nextInt();
        if (cp < sp)
            System.out.println("He incurred a profit");
        else if (cp > sp)
            System.out.println("He incurred a loss");
        else
            System.out.println("No profit or no loss");

    }

}
