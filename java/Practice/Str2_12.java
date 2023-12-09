

import java.util.Scanner;

public class Str2_12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        boolean flag= false;
        for (int i = 0; i < s1.length() && i<s2.length(); i++) {
          for (int j = 0; j < s2.length() && j<s1.length(); j++) {
             if(s1.charAt(i)==s2.charAt(i)){
                System.out.println(s1.charAt(i)+" "+s2.charAt(i));
            flag=true;
            System.out.println(flag);
            break;
            }
            else{
            System.out.println(flag);
                break;
            }

        }}
    }
}
