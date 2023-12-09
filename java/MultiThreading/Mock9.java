import java.util.Scanner;

public class Mock9 {
    public static void m1(int n) {
        if (n > 1) {
            m1(--n);
            System.out.println(n);
        } 
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        m1(n);

    }
}
