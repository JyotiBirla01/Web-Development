
//2. Write a Java program to get the character at the given index within the String
import java.util.Scanner;

public class Ass2 {
    public char getCharacter(char ch[], int index) {

        return ch[index];
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.nextLine();
        System.out.println("Enter the index");
        int index = sc.nextInt();
        char ch[] = s.toCharArray();
        Ass2 obj = new Ass2();
        System.out.println(obj.getCharacter(ch, index));
    }
}