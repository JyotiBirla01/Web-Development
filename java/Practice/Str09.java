

import java.util.Scanner;

public class Str09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        boolean flag = false;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0' || ch[i] == '1' || ch[i] == '2' || ch[i] == '3' || ch[i] == '4' || ch[i] == '5'
                    || ch[i] == '6' || ch[i] == '7' || ch[i] == '8' || ch[i] == '9')
                flag = true;
                else
                break;
        }
        if (flag)
            System.out.println("String contain only digit");
        else
            System.out.println("String not  contain only digit");
    }

}
