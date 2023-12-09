
/*23. Write a Java program to Count words in Given String */
import java.util.Scanner;

public class Ass23 {
    public int countWords(String s) {
        String parts[] = s.split(" ");
        int count = 0;
        for (int i = 0; i < parts.length; i++) {
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

        Ass23 obj = new Ass23();
        System.out.println(obj.countWords(s));

    }
}