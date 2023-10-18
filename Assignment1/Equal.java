import java.util.Scanner;

class Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Nubers are equal");
        } else {
            if (n1 > n2) {
                System.out.println(n1 + " is greatest");
            } else {
                System.out.println(n2 + " is greatest");
            }
        }

    }

}
