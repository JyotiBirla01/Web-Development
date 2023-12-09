
//30. Write a Java program to find the maximum occurring character in a string
import java.util.Scanner;

public class Ass30 {
    public void maxOccuring(char ch[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }

            }
            System.out.println(ch[i] + "-" + count);
            i = i + (count - 1);
            if (count > max) {
                max = count;
            }

        }
        System.out.println("The maximum occurring character in a string" + max);

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String in sorted form");
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        Ass30 obj = new Ass30();

        obj.maxOccuring(ch);

    }
}