/*43. Write a program to Convert a character array to string
 */


import java.util.Scanner;
 class Test {
    public void convert(char ch[]) {
        String s="";
        for(int i=0;i<ch.length;i++){
          s=s+ch[i];
        }
        System.out.println("String is : "+s);
    }
  }
            
        // System.out.println(p);
              
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char array ");
        char ch[] = new char[5];
        for(int i=0;i<ch.length;i++){
            ch[i]=sc.next().charAt(0);
        }
         new Test().convert(ch);
        }
}
