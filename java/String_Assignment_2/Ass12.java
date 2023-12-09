//12. Write a Java program to create a character array containing the contents of a string

import java.util.Scanner;

public class Ass12 {
    public String content(String s) {

        return s;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();

        char b[] = new char[n];
        System.out.println("Enter the  characters");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.next().charAt(0);
        }
        String s = new String(b);

        Ass12 obj = new Ass12();
        System.out.println(obj.content(s));

    }
}
