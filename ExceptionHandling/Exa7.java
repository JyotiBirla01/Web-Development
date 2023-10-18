import java.util.Scanner;

public class Exa7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the vale of a");
            int a = sc.nextInt();
            System.out.println("Enter the value of b");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
        }
        // catch (Exception e) {
        // System.out.println(e);

        // }
        // catch (Exception e) {
        // System.out.println(e);
        // }
        finally {
            System.out.println("-----finally --------------");
        }
        System.out.println("-----end ----------------");
    }

}
