
//21. Write a Java program to create a new string repeating every character twice of a given string
import java.util.Scanner;

public class Ass21 {
    public void newString(char ch[]) {
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
            System.out.print(ch[i]);

        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        char ch[] = s.toCharArray();

        Ass21 obj = new Ass21();
        obj.newString(ch);

    }
}