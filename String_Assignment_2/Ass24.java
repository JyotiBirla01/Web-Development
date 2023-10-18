
//24. Write a Java program to Swap Two Strings
import java.util.Scanner;

public class Ass24 {
    public void swap(String s1, String s2) {
        String temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println("After swapping the string ");
        System.out.println("s1 :" + s1);
        System.out.println("s2 : " + s2);

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first  String ");
        String s1 = sc.nextLine();
        System.out.println("Enter the  second String ");
        String s2 = sc.nextLine();
        System.out.println("String before swapping");
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
        Ass24 obj = new Ass24();
        obj.swap(s1, s2);

    }
}