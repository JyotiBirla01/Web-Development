
//31. Write a Java program to reverse words in a given string

import java.util.Scanner;

class Ass31 {
    public void reverse(String s) {

        String parts[] = s.split(" ");
        String reverse = "";
        for (int i = 0; i < parts.length; i++) {
            String word = parts[i];
            reverse = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverse = reverse + word.charAt(j);
            }
            System.out.print(reverse + " ");

        }

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        Ass31 obj = new Ass31();

        obj.reverse(s);

    }
}
