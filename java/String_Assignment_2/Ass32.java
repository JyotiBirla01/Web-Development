
//32. Write a Java program to find maximum between two string
import java.util.Scanner;

public class Ass32 {
    public String maximum(char ch1[], char ch2[]) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < ch1.length; i++) {
            count1++;
        }
        for (int i = 0; i < ch2.length; i++) {
            count2++;
        }
        if (count1 > count2)
            return "String first is maximum";
        else
            return "String second is maximum";
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  first String ");
        String s1 = sc.nextLine();
        System.out.println("Enter the  second String ");
        String s2 = sc.nextLine();
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        Ass32 obj = new Ass32();
        System.out.println(obj.maximum(ch1, ch2));

    }
}
