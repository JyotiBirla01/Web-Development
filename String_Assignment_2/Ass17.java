//17. Write a Java program to replace each substring of a given string that matches the 
//given regular expression with the given replacement

import java.util.Scanner;

public class Ass17 {

    public void replace(String s, String replace, String place) {
        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            for (int j = i; j < s.length(); j++) {
                temp = temp + s.charAt(j);
                if (temp.equals(replace)) {
                    temp = place;
                    System.out.println(s);
                }

            }
        }

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();

        System.out.println("Enter the string which is substring in string ");
        String replace = sc.nextLine();
        System.out.println("Enter the place ");
        String place = sc.nextLine();

        Ass17 obj = new Ass17();
        obj.replace(s, replace, replace);

    }
}
