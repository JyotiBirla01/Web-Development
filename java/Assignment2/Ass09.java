import java.util.Scanner;

class Ass09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        if (n > 0)
            System.out.println("The number is positive");
        else
            System.out.println("The number is negative ");
    }
}
