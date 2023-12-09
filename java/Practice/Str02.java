
//Write a java program to find all possible palindrome of given String.
//Sample Input: “aaabbbacccababacccaabb”

import java.util.Scanner;

public class Str02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        char ch[]= s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <s.length(); j++) {
                for (int j2 = i; j2 < j; j2++) {
                    System.out.print(ch[j2]+" ");
                }
                System.out.println();
            }
        }
    

    }
    
}
