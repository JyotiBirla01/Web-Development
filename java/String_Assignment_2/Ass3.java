
//Write a Java program to count a number of Unicode code points in the specified text 
//range of a String.
import java.util.Scanner;

public class Ass3 {
    int count = 0;
//codepoint is a method is uesd to count char from given specified index
    public int codePointCount(char ch[]) {
        for (int i = 0; i < ch.length; i++) {
            count++;

        }
        return count;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        char ch[] = s.toCharArray();

        Ass3 obj = new Ass3();
        System.out.println(obj.codePointCount(ch));
    }
}