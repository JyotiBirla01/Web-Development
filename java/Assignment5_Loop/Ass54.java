import java.util.Scanner;

public class Ass54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start  number ");
        int start = sc.nextInt();
        System.out.println("Enter the  end number ");
        int end = sc.nextInt();
        System.out.println("Even number between two enterd number ");
        for (int i = start; i <= end; i++) {

            if (i % 2 == 0)
                System.out.println(i);
        }

    }
}
