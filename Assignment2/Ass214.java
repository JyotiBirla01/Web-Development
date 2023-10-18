
//WAP to find lowest number among four different number
import java.util.Scanner;

class Ass214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  first Number  ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second Number  ");
        int n2 = sc.nextInt();
        System.out.println("Enter the Third  Number  ");
        int n3 = sc.nextInt();
        System.out.println("Enter the fourth   Number  ");
        int n4 = sc.nextInt();

        if (n1 < n2 && n1 < n3 && n1 < n4) {
            System.out.println(n1 + " is lowest number ");
        } else {
            if (n2 < n1 && n2 < n3 && n2 < n4)
                System.out.println(n2 + " is lowest number  ");
            else if (n3 < n1 && n3 < n2 && n3 < n4)
                System.out.println(n3 + " is lowest number  ");
            // else if (n4<n1 && n4<n2 && n4<n3 )
            else
                System.out.println(n4 + " is lowest ");

        }

    }
}