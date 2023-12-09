//9. Write a Java program to get a substring of a given string between two specified 
//positions

import java.util.Scanner;

public class Ass19 {
    public void subString(String s, int beg, int end) {

        // for (int i = beg; i <= end; i++) {
        // String temp = "";
        // for (int j = i; j < s.length(); j++) {
        // temp = temp + s.charAt(j);
        // System.out.println(temp);
        // }

        // }
        for (int i = beg; i <= end; i++) {
            System.out.print(s.charAt(i));
        }
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("Enter the begnning index");
        int beg = sc.nextInt();
        System.out.println("Enter the end index");
        int end = sc.nextInt();

        Ass19 obj = new Ass19();

        obj.subString(s, beg, end);
    }
}
