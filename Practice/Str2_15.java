import java.util.Scanner;

public class Str2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch[] = new char[n];
        for (int i = 0; i < ch.length; i++) {
            ch[i]=sc.next().charAt(0);
        }
        String s= new String(ch);
        System.out.println(s);

    }
}
