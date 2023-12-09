import java.util.Scanner;

public class fibonnaci {
    private int n;

    public void setData(int n) {
        this.n = n;
    }

    public void m1() {
        int a = -1;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        fibonnaci obj = new fibonnaci();
        obj.setData(n);
        obj.m1();

    }
}