import java.util.Scanner;

public class Ascii {
    public void find(char ch) {
        int x = ch;
        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
            System.out.println(x);

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        Ascii obj = new Ascii();
        obj.find(ch);

    }
}