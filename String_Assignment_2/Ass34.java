
//34. Write a Java program to check if the letter 'x' is present in the word 'String Exercises'
import java.util.Scanner;

public class Ass34 {
    public void check(String s, char letter) {
        String parts[] = s.split(" ");
        for (int i = 0; i < parts.length; i++) {
            char partsArray[] = parts[i].toCharArray();
            for (int j = 0; j < partsArray.length; j++) {
                if (partsArray[j] == letter)
                    System.out.println("The " + letter + " is present in string " + parts[i]);
            }
        }
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s = sc.nextLine();
        System.out.println("Enter the character");
        char letter = sc.next().charAt(0);
        Ass34 obj = new Ass34();
        obj.check(s, letter);
    }
}