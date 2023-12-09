
//45. Write a program to Check given strings are Anagram or not
import java.util.Scanner;

class Anagram {

    public void findAnagram(char ch1[], char ch2[]) {

        int count = 0;
        for (int i = 0; i < ch1.length; i++) {

            for (int j = 0; j < ch2.length; j++) {
                if (ch1[i] == ch2[j]) {
                    count++;

                }

            }

        }
        if (count == ch1.length) {
            System.out.println("Anagram");
        } else
            System.out.println("Not Anagram");

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string s1 ");
        String s1 = sc.nextLine();
        char ch1[] = s1.toCharArray();
        System.out.println("Enter the string s2 ");
        String s2 = sc.nextLine();
        char ch2[] = s2.toCharArray();

        Anagram obj = new Anagram();
        obj.findAnagram(ch1, ch2);

    }
}
