/*38. Write a program to Trim a given string using String.trim() method 
 */
import java.util.Scanner;
 class Test {
     public String convert(char ch[]) {
        String s="";
       for(int i=0;i<ch.length;i++){
         if(ch[i]==' '){
            continue;
         }
         else
           s=s+ch[i];
       }
      return s;
    }  
}                 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "@     subadra     @";
        char ch[]=s1.toCharArray();
        String s= new Test().convert(ch);
        System.out.println(" Trim string is : "+s);
        }
}
