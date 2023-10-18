//20. Write a Java program to trim any leading or trailing whitespace from a given string

import java.util.Scanner;

class Trim {
    String s;

    public void trim(char ch[], char space) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == space)
                continue;
            System.out.print(ch[i]);

        }

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();

        char space = ' ';

        char[] ch = s.toCharArray();
        Trim obj = new Trim();
        obj.trim(ch, space);

    }
}
