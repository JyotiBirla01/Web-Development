
/* 
  12) Input data exactly in the following format, and print sum of all integer values.
	  Sample Input: “67, 89, 23, 67, 12, 55, 66”. 
      (Hint use String class split method and Integer class parseInt method)
*/
import java.util.Scanner;

class SumStringNum {
    public int sumStringNum(String parts[], int n) {
        int ch[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            ch[i] = Integer.parseInt(parts[i]);
            // System.out.println(ch[i]);
            sum = sum + ch[i];
        }
        return sum;
    }
}

public class P12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("print sum of all integer values\nSample Input: 67, 89, 23, 67, 12, 55, 66\n\n");
        System.out.println("\nenter String of numbers comma sperated : ");
        String str = sc.nextLine();
        String parts[] = str.split(",");
        int n = parts.length;
        // System.out.println(n);
        SumStringNum obj = new SumStringNum();
        int res = obj.sumStringNum(parts, n);
        System.out.println("Sum of String intergers values is: " + res);
    }
}