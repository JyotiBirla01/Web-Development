// Reverse Letter
public class p6 {
    public static void main(String[] args) {
        String s = "Java is simple ";

        String str[] = s.split(" ");
        String t = " ";
        // String sen = " ";
        for (int i = str.length - 1; i >= 0; i--) {
            String temp = str[i];
            String reverseword = " ";
            for (int j = temp.length() - 1; j >= 0; j--) {
                reverseword += temp.charAt(j);

            }
            t += reverseword + " "; 
            // sen += str[i] + " ";

        }
        System.out.println(t);
        // System.out.println(sen);

    }

    
}
