
//WAP to find out LCM of a number
import java.util.Scanner;

public class Ass41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int lcm = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
lcm = i;
        }
        System.out.println("LCM is " + lcm);
        
    }

}
