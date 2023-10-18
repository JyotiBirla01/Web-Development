import java.util.Scanner;

class Exa10 {
    private static int a, b, c;

    public void getData(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public static void divide(int a, int b) {
        try {

            c = a / b;
            System.out.println(c);

        } catch (Exception e) {
            System.out.println(e);
        }  

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 ");
        int a = sc.nextInt();
        System.out.println("Enter the number 2 ");
        int b = sc.nextInt();

        Exa10.divide(a, b);
    }
}