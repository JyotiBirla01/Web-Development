
//15. Write a java program to get the length of a given string
import java.util.Scanner;

class LengthMethod {
    public int length(char ch[]) {
        int count = 0;
        for (int i = 0; i < ch.length; i++) {

            count++;

        }
        return count;

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        LengthMethod obj = new LengthMethod();
        int ans = obj.length(ch);
        System.out.println(ans);

    }
}