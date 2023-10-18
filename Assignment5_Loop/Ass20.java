import java.util.Scanner;

class Ass20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nubmer ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(" " + 7 * i);
        }
        System.out.println();
    }

}