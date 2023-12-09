import java.util.Scanner;

class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char ");
        char ch = sc.next().charAt(0);
        String x = ch >= 65 && ch <= 90 ? "Uppercase" : "Lowercase";

        System.out.println(x);
    }

}
