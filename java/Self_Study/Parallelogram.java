import java.util.Scanner;

public class Parallelogram {

    static int b;
    static int h;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter b");
        b = sc.nextInt();
        System.out.println("Enter h");
        h = sc.nextInt();
        int area = b * h;
        if (b > 0 && h > 0)
            System.out.println(area);
        else
            System.out.println("java.lang.Exception: Breadth and height must be positive");

    }

}