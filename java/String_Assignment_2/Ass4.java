
/*
 * Write a Java program to compare two strings lexicographically Two strings are
 * lexicographically equal if they are the same length and contain the same
 * characters in the
 * same positions
 */

/*5. Write a Java program to compare two strings lexicographically , ignoring case
 differences
*/
import java.util.Scanner; 

class Test {
    public void lexicographically(String s1,String s2) {

        for (int i = 0; i < s1.length() && i<s2.length(); i++) {
            if(s1.charAt(i)==s2.charAt(i))
            continue;
            else
            System.out.println(s1.charAt(i)-s2.charAt(i));
            
        }
        if(s1.length()<s2.length())
        System.out.println(s1.length()-s2.length());
else if(s1.length()>s2.length())
System.out.println(s1.length()-s2.length());
else
System.out.println("0");
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the   string ");
        

        String s1 = sc.nextLine();
        System.out.println("Enter the  string ");
        String s2= sc.nextLine();

        Test obj = new Test();
        obj.lexicographically(s1,s2);

    }
}