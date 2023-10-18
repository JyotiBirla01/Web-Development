
//2) WAP to print N natural number. 
import java.util.Scanner;

public class Ass2 {
    public void naturalNumber(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        Ass2 obj = new Ass2();
        obj.naturalNumber(n);
    }

}
