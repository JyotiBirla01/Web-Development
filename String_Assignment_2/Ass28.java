
//28. Write a Java program to find first non repeating character in a string

import java.util.Scanner;

public class Ass28 {
    public void FirstNonRepeating(char ch[]) {
        int i, j;
        boolean flag = true;
        int rep;
        for (i = 0; i < ch.length; i++) {
            rep = 0;
            for (j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j])
                    rep++;
            }
            if (rep < 2) {
                flag = false;
                System.out.println(ch[i]);
                break;

            }

        }
        if (flag) {
            System.out.println("0");
        }

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        Ass28 obj = new Ass28();

        obj.FirstNonRepeating(ch);

    }
}