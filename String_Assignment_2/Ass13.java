
//13. Write a Java program to convert all the characters in a string to Lowercase
import java.util.Scanner;

class LowerCase {
    public void toLowerCase(char ch[]) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 65 && ch[i] <= 90) {
                int result =  (ch[i] + 32);
                ch[i] = (char) (result);
            }

        }
        System.out.println("String is lowerCase is ");
        for (char arr : ch)
            System.out.print(arr);

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();

        char[] ch = s.toCharArray();
        LowerCase obj = new LowerCase();
        obj.toLowerCase(ch);

    }
}