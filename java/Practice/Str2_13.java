import java.util.Scanner;

public class Str2_13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        byte b[]= new byte[n];
        for (int i = 0; i < b.length; i++) {
            b[i]=sc.nextByte();
        }
        String s= new String(b);
        System.out.println(s);

    }
}
