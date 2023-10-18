
/*
7. Write a Java program to test if a given string contains the specified sequence of char
 values */
import java.util.Scanner;

class ContainsMethod {
    boolean flag = false;

    public boolean contains(String s, String word) {
        String splitWords[] = s.split(" ");
        for (int i = 0; i < splitWords.length; i++) {
            if (word.equals(splitWords[i])) {
                flag = true;
            }

        }
        if (flag)
            return true;
        else
            return false;

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();

        System.out.println("Enter the word ");
        String word = sc.nextLine();
        ContainsMethod obj = new ContainsMethod();
        boolean ans = obj.contains(s, word);
        System.out.println(ans);

    }
}
