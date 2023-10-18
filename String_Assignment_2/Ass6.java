
//6. Write a Java program to concatenate a given string to the end of another string

import java.util.Scanner;

class Ass6 {
    public String concatenate(String s1, String s2) {
        String result = s1 + s2;
        return result;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s1 = sc.nextLine();
        System.out.println("Enter the Second String ");
        String s2 = sc.nextLine();
        Ass6 obj = new Ass6();
        System.out.println(obj.concatenate(s1, s2));
    }
}
