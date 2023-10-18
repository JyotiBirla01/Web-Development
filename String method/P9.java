
/* 
  9) WAP to find word of maximum length in given String.
	 Sample Input: “Dear Student ,You have need to work hard”
`	 Output: “Student”
*/
import java.util.Scanner;

class MaxLength {
    public void maxLength(String parts[], int n) {
        int max = 0, idx = 0;
        for (int i = 0; i < n; i++) {
            int leng = parts[i].length();
            // System.out.println(len);
            if (max < leng) {
                max = leng;
                idx = i;
            }
        }
        System.out.println("MAX : " + parts[idx]);
    }
}

public class P9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sample Input: Dear Student ,You have need to work hard\nOutput: Student");
        System.out.println("\nenter string: ");
        String str = sc.nextLine();
        String parts[] = str.split(" ");
        int n = parts.length;
        ;
        MaxLength obj = new MaxLength();
        obj.maxLength(parts, n);
    }
}