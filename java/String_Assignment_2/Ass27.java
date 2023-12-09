
//27. Write a Java program How to search a word inside a string?
import java.util.Scanner;

public class Ass27 {
    public void search(String s, String word) {
        boolean flag = true;
        String parts[] = s.split(" ");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].equals(word)) {
                flag = false;
                System.out.println("The word is found ");
            }
        }
        if (flag)
            System.out.println("The word is not found");

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        System.out.println("Enter the word which you want to search");
        String word = sc.nextLine();
        Ass27 obj = new Ass27();

        obj.search(s, word);

    }
}