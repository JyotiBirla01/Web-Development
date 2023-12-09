// WAP to remove the duplicate letters from given String.
// 	Sample Input: “aabbccddd”
// 	Output: “abcd”
 

import java.util.Scanner;
class Str03{
public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        char ch[]= s.toCharArray();
        int j=0;
        for (int i = 0; i < ch.length; i++) {
            for ( j = 0; j < i+1; j++) {
                if(ch[i]==ch[j])
                break;
            }
            if(i==j)
            System.out.println(ch[i]);
        }
    }
    
}
