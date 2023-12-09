
//18. Write a Java program to check whether a given string starts with the contents of
// another string
import java.util.Scanner;

public class Ass18 {
    boolean flag = false;

    public boolean check(String s1, String s2) {
        String parts1[] = s1.split(" ");
        String parts2[] = s2.split(" ");
        for (int i = 0; i < parts1.length; i++) {

            if (parts1[i].equals(parts2[0])) {
                flag = true;

            }
        }
        if (flag)
            return flag;
        else
            return flag;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.nextLine();
        System.out.println("Enter the String ");
        String s2 = sc.nextLine();
        Ass18 obj = new Ass18();
        System.out.println(obj.check(s1, s2));

    }
}
