import java.util.Scanner;

class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char ");
        char ch = sc.next().charAt(0);
        char v1 = 'a', v2 = 'e', v3 = 'i', v4 = 'o', v5 = 'u', v6 = 'A', v7 = 'E', v8 = 'I', v9 = 'O', v10 = 'U';

        String x = (ch == v1 || ch == v2 || ch == v3 || ch == v4 || ch == v5 || ch == v6 || ch == v7 || ch == v8
                || ch == v9 || ch == v10) ? "Vowel" : "Consonant";

        System.out.println("The character is " + x);
    }

}
