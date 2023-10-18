
//37. Write a Java program to Count Number of Uppercase and Lowercase letters
import java.util.Scanner;

public class Ass37 {
    public void countNumber(char ch[]) {
        int upperCount = 0, lowerCount = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 65 && ch[i] <= 90) {
                upperCount++;

            } else if (ch[i] >= 97 && ch[i] <= 122) {
                lowerCount++;
            }

        }
        System.out.println("The number of upper case " + upperCount);
        System.out.println("The number of lower case " + lowerCount);

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        Ass37 obj = new Ass37();
        obj.countNumber(ch);

    }

}