
/* 
  8) WAP to find out total occurrence of each letter in string.
	 Sample Input: “aabbccddd”
	 Output:   a- 2 times
			   b- 2 times
			   c- 2 times
			   d- 3 times
*/
import java.util.Scanner;

class OccurrenceString {
    public void occurrenceString(String str) {
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr == prev)
                count++;
            else {
                System.out.print(str.charAt(i - 1));
                if (count >= 1)
                    System.out.println("- " + count + " times");
                count = 1;

            }
        }
        System.out.println(str.charAt(str.length() - 1) + "- " + count + " times");
    }
}

public class P8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                " total occurrence of each letter in string.\nSample Input: “aabbccddd”\nOutput:a- 2 times\nb- 2 times\nc- 2 times\nd- 3 times\n");
        System.out.print("\n\nenter string : ");
        String str = sc.nextLine();
        OccurrenceString obj = new OccurrenceString();
        obj.occurrenceString(str);
    }
}