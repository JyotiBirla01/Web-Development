
/* Write a java program to find all possible palindrom of given String.
	Sample Input: “aaabbbacccababacccaabb”*/
import java.util.Scanner;

class Ass33 {
    public void pallindrom(String s) {
        int j;
        for (int i = 0; i < s.length(); i++) {
            for (j = i + 1; j <= s.length(); j++) {
                String subString = s.substring(i, j);
                String sub = subString;
                String rev = "";
                for (int k = subString.length() - 1; k >= 0; k--) {
                    rev = rev + (subString.charAt(k));
                }
                if (rev.equals(sub)) {
                    System.out.println(rev);
                }
            }

        }
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s = sc.nextLine();
        System.out.println(" possible palindrome string are :");
        Ass33 obj = new Ass33();
        obj.pallindrom(s);
    }
}