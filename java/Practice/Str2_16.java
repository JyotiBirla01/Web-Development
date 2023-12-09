

import java.util.Scanner;

public class Str2_16 {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String s= sc.nextLine();
    char ch[]= s.toCharArray();
    for (int i = 0; i < ch.length; i++) {
        if(ch[i]>=65 &&ch[i]<=90){
            int result=ch[i]+32;
            ch[i]=(char)result;
        }
    }
    for (char c : ch) {
        System.out.print(c+" ");
    }
   } 
}
