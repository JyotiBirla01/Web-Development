
// W.A.P to check whether a charachter is an alphabet or not.
import java.util.Scanner;

class Ass220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character ");
        char ch = sc.next().charAt(0);
        if (ch >= 65 && ch <= 90)
            System.out.println("The character is alphabet");
        else if (ch >= 97 && ch <= 122)
            System.out.println("The character is alphabet");
        else
            System.out.println("The character is not alphabet ");
    }

}
