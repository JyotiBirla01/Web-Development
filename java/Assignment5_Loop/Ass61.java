import java.util.Scanner;

public class Ass61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting year");
        int a = sc.nextInt();
        System.out.println("Enter the end year ");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {

            if ((i % 4 == 0 && i % 100 != 0) || (i % 100 == 0 && i % 400 == 0)) {

                System.out.println(i + "  is Leap Year");
            }
        }

    }

}
