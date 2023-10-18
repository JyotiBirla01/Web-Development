
/*41. Write a program to Compare the strings using equals(), compareTo() and == operator
 */
import java.util.Scanner;

class Test {
  public void compare(String s1, String s2) {
    System.out.println(s1.equals(s2));
    System.out.println(s1.compareTo(s2));
    System.out.println(s1 == s2);
  }
}

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first string ");
    String s1 = sc.nextLine();
    System.out.println("Enter second string ");
    String s2 = sc.nextLine();
    new Test().compare(s1, s2);
  }
}
