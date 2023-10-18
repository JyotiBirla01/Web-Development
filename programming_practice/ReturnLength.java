
/*Write a string a consisting of words and space return the length of word in string 
 * Example- Hello World
 * output =5
 */
import java.util.Scanner;

public class ReturnLength {
    public void split(String s) {
        String parts[] = s.split(" ");
        String s2 = parts[parts.length - 1];
        System.out.println(s2);
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            count++;

        }
        System.out.println(count);

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        ReturnLength obj = new ReturnLength();
        obj.split(s);

    }
}