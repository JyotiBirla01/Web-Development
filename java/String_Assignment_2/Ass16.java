
//16. Write a Java program to replace a specified character with another character
import java.util.Scanner;

public class Ass16 {
    int index;

    public void replace(char ch[], char replace, char place) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == replace) {
                index = i;
                System.out.println(ch[index] = place);
            }

        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        System.out.println("Enter the character which you want to replace");
        char replace = sc.next().charAt(0);
        System.out.println("Enter the character which you want to place  ");
        char place = sc.next().charAt(0);

        Ass16 obj = new Ass16();
        obj.replace(ch, replace, place);

    }
}