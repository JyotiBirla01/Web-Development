

import java.util.Scanner;

public class Str06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String parts[] = s.split(" ");
        int count = 0;
        for (int i = 0; i < parts.length; i++) {
            String word = parts[i];
            char ch = word.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U')
                count++;
        }
        System.out.println(count);

    }

}
