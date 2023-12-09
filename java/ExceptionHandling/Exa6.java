import java.util.Scanner;

public class Exa6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of a ");
            int a = sc.nextInt();
            System.out.println("Enter the value of b ");
            int b = sc.nextInt();
            int c = a / b;
        } catch (Exception e) {
            System.out.println(e);
            // System.out.println("Invalide ");

        } finally {
            System.out.println("Hello");
        }
        System.out.println("End ");
    }

}
