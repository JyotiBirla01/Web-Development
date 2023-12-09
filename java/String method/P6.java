/* 
  6) Write a java program to find all possible palindrom of given String.
	 Sample Input: “aaabbbacccababacccaabb”
*/

import java.util.Scanner;

class NoOfPalindrom {
    private static int c = 0;

    public static boolean isPalindrom(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))// dout
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void noOfpalindrom(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (NoOfPalindrom.isPalindrom(str.substring(i, j))) {
                    System.out.println(str.substring(i, j) + " ");
                    c++;
                }
            }
        }
        System.out.println("all possible palindrom : " + c);
    }
}

public class P6 {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println(" find all possible palindrom of given String.\nSample Input: aaabbbacccababacccaabb\n");
    System.out.print("\n\nenter string : ");
    String str=sc.nextLine();
    NoOfPalindrom obj=new NoOfPalindrom();
    obj.noOfpalindrom(str);
}
}