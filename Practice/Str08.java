/*3)WAP check if two Strings are anagrams of each other?
(Hint Anagram words: LISTEN - SILENT 
 */

import java.util.Scanner;

public class Str08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();

        char ch1[]= s1.toCharArray();
         String s2= sc.nextLine();
        
        char ch2[]= s2.toCharArray();
        boolean flag= false;
        for (int i = 0; i < ch1.length; i++) {
            for(int j=0; j<ch2.length; j++){
            if(ch1[i]==ch2[j])
            flag =true;
        }}
        if(flag)
        System.out.println("Anagram");
        else 
        System.out.println("Not anagram");

    }
}
