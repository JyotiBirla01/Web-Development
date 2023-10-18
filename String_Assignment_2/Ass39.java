/*39. Write a program to Replace string with another string in java using String.replace() method */

import java.util.Scanner;
 class Test {
     public void compare(String s1,String replace) {
        System.out.println(" before replace string is : "+s1);
        s1=replace;
        System.out.println(" after replace string is : "+s1);

     }
    }                   
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String s1 = sc.nextLine();
        System.out.println("Enter a replace string ");
        String replace = sc.nextLine();
         new Test().compare(s1,replace);
        }
}
