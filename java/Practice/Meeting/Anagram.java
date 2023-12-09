// abc
// cba
public class Anagram {
    public static void main(String[] args) {
        String s11 = "abc";
        String s22 = "cbad";
        String s1 = s11.toLowerCase();
        String s2 = s22.toLowerCase();
        int count1 = 0, count2 = 0;
        if (s1.length() == s2.length()) {
            count1 = 0;
            count2 = 0;
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s1.length(); j++) {
                    if (s1.charAt(i) == s1.charAt(j))
                        count1++;
                }
                if (count1 != count2)
                    break;

            }
            for (int i = 0; i < s2.length(); i++) {
                if (s1.charAt(i) == s2.charAt(i))
                    count2++;

            }
            if (count1 != count2) {
                System.out.println(" Not anagram");
            }
            else{
                System.out.println(" anagram");
            }

        } else {
            System.out.println("Not Anagram");
        }
    }
}
