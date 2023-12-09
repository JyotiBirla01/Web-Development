
//29. Write a Java program to print after removing duplicates from a given string
import java.util.Scanner;

public class Ass29 {

    int i, j;

    public void removeDuplicate(char ch[]) {

        for (i = 0; i < ch.length; i++) {
            for (j = 0; j < i + 1; j++) {
                if (ch[i] == ch[j]) {
                    break;
                }

            }
            if (i == j)
                System.out.print(ch[i] + " ");

        }
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        Ass29 obj = new Ass29();

        obj.removeDuplicate(ch);

    }
}