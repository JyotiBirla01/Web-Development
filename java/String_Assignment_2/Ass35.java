import java.util.Scanner;

class LowerCase {
    public void toLowerCase(char ch[]) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 65 && ch[i] <= 90) {
                int result = (int) (ch[i] + 32);
                ch[i] = (char) (result);
            }

        }
        for (char arr : ch)
            System.out.print(arr);

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String in upper case");
        String s = sc.nextLine();

        char[] ch = s.toCharArray();
        LowerCase obj = new LowerCase();
        obj.toLowerCase(ch);

    }
}