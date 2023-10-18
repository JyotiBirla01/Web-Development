
import java.util.Scanner;

public class Str04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = new char[s.length()];
      //  int count = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(i) == ch[j])
                    flag =false;
            }

            if (flag) {
                ch[i] = s.charAt(i);
             int   count = 0;
                for (int k = 0; k < s.length(); k++) {
                   
                    if (s.charAt(k) == ch[i]) {
                        count++;

                    }
                  
                }
                

            }
        }

    }
}
