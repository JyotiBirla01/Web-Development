import java.util.Scanner;

public class ie1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number ");
        int n2 = sc.nextInt();
        System.out.println("Enter the third number ");
        int n3 = sc.nextInt();
        if (n1 < n2 && n1 < n3) {
            System.out.println(n1 + " is smallest");
        } else if (n2 < n1 && n2 < n3) {
            System.out.println(n2 + "  is smallest ");
        } else if (n3 < n1 && n3 < 2) 
            System.out.println(n3 + "n is smallest ");
        }

    }

}
