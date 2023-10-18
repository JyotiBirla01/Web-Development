//10. Write a Java program to get the contents of a given string as a byte array

import java.util.Scanner;

public class Ass10 {
    public String content(String s) {

        return s;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();

        byte b[] = new byte[n];
        System.out.println("Enter the letters in byte");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextByte();
        }
        String s = new String(b);

        Ass10 obj = new Ass10();
        System.out.println(obj.content(s));

    }
}