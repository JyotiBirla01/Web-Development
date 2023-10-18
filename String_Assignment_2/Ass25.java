
//24. Write a Java program to Swap Two Strings without third string variable
import java.util.Scanner;

public class Ass25 {
    public void swap(char ch1[], char ch2[], String s1, String s2) {

        for (int i = 0; i < ch1.length && i < ch2.length; i++) {
            ch1[i] ^= ch2[i];
            ch2[i] ^= ch1[i];
            ch1[i] ^= ch2[i];
        }
        System.out.println("After swapping the string ");
        s1 = new String(ch1);
        s2 = new String(ch2);
        System.out.println(s1);
        System.out.println(s2);

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first  String ");
        String s1 = sc.nextLine();
        System.out.println("Enter the  second String ");
        String s2 = sc.nextLine();
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        Ass25 obj = new Ass25();
        obj.swap(ch1, ch2, s1, s2);

    }
}