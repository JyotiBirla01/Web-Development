
/*5. Write a Java program to compare two strings lexicographically , ignoring case
 differences
*/
import java.util.Scanner;

class Test {
    public void lexicographically(String s[]) {
        String temp;
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].compareTo(s[j]) > 0) {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of  string array");
        int n = sc.nextInt();

        String s[] = new String[n];
        System.out.println("Enter the words in string ");
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine();

        }

        Test obj = new Test();
        obj.lexicographically(s);

    }
}