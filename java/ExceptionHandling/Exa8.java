import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Exa8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number 1");
            int a = sc.nextInt();
            System.out.println("Enter the number 2");
            int b = sc.nextInt();
            try {
                int c = a / b;

            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println(" ------inner finally ------------");
            }

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            System.out.println("------------outer finally");
        }
    }
}
