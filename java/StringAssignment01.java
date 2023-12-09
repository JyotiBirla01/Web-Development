import java.util.Scanner;

public class StringAssignment01 {
    public String getReverseString(String s) {
        // String a[] = s.split(" ");
        // String b[] = new String[a.length];
        // for (int i = 0; i < s.length(); i++) {
        // String word = a[i];
        // for (int j = word.length() - 1; j >= 0; j--) {
        // b[i] += word.charAt(j);
        // }
        // }
        // return b;
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        return rev;

    }

    public String getRemoveDuplicate(String s) {
        char c[] = s.toCharArray();
        int i = 0, j = 0;
        String s1 = "";
        for (i = 0; i < c.length; i++) {
            for (j = 0; j < c.length; j++) {
                if (c[i] == c[j]) {
                    break;
                }
            }
            if (i == j) {
                s1 += c[i];
            }
        }
        return s1;
    }

    public String getMaxLength(String s) {
        String a[] = s.split(" ");
        int max_length = 0;
        String res = "";
        for (int i = 0; i < a.length; i++) {
            int length = a[i].length();
            if (length > max_length) {
                max_length = length;
                res = a[i];

            }
        }
        return res;
    }

    public int getFirstLetterVowelCount(String s) {
        String a[] = s.split(" ");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            String word = a[i];
            char c = word.charAt(0);
            if (c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                count++;

            }
        }
        return count;
    }

    public int getVowelCountInName(String name) {
        char c1[] = name.toCharArray();
        int count = 0;
        for (int i = 0; i < c1.length; i++) {
            char c = c1[i];

            if (c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                count++;

            }
        }
        return count;
    }

    public boolean getCHKAnagrams(String s1, String s2) {
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        boolean flag = true;
        int i = 0, j = 0;
        if (c1.length == c2.length) {
            for (i = 0; i < c1.length; i++) {
                for (j = 0; j < c2.length; j++) {
                    if (c1[i] == c2[j])
                        break;
                }
                if (j == c2.length) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }

    public boolean getCHKStringOnlyDigit(String s) {
        char c[] = s.toCharArray();
        int i = 0;
        boolean flag = true;
        for (i = 0; i < c.length; i++) {
            if (c[i] == '0' || c[i] == '1' || c[i] == '2' || c[i] == '3' || c[i] == '4' || c[i] == '5' || c[i] == '6'
                    || c[i] == '7' || c[i] == '8' || c[i] == '9') {
                continue;

            } else {
                break;
            }
        }
        if (i < c.length) {
            flag = false;
        }
        return flag;
    }

    public String[][] getCountOFElements(String s) {
        char ch[] = s.toCharArray();
        int count = 0;
        String s1 = getRemoveDuplicate(s);
        // char c[] = s1.toCharArray();
        // int c[] = new int[s1.length()];
        String a[] = new String[s1.length()];
        String str[][] = new String[s1.length()][2];
        // for (int i = 0; i < s1.length(); i++) {
        // c[i] = s1.charAt(i);
        // }
        for (int i = 0; i < s1.length(); i++) {
            // count =0;
            for (int j = 0; j < a.length; j++) {
                if (s1.charAt(i) == ch[j]) {
                    count++;
                }
            }
            char val = s1.charAt(i);
            str[i][0] = "" + ch[i];
            str[i][1] = "" + count;

        }
        for (int i = 0; i < str.length; i++) {

        }

        return str;
    }
}

class MainAssi {
    public static void main(String[] args) {
        StringAssignment01 sm = new StringAssignment01();
        String s = "Java Is Plateform Independent";
        String[] s3 = s.split(" ");
        String output = " ";
        for (int i = 0; i < s3.length; i++) {
            output = output + sm.getReverseString(s3[i] + " ");
        }
        System.out.println(output);

        // for (int i = 0; i < a.length; i++) {
        // System.out.println(a[i]);
        // }
        String s1 = "adabbccddda";
        System.out.println(sm.getRemoveDuplicate(s1));
        System.out.println(sm.getMaxLength(s));
        System.out.println(sm.getFirstLetterVowelCount(s));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person");
        String s2 = sc.nextLine();
        System.out.println(sm.getVowelCountInName(s2));
        String a1 = "TRIANGLE";
        String a2 = "LETRIANG";
        System.out.println(sm.getCHKAnagrams(a1, a2));
        String a3 = "12357890";
        System.out.println(sm.getCHKStringOnlyDigit(a3));
        String arr[][] = sm.getCountOFElements(s1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}