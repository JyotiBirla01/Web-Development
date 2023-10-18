import java.util.Scanner;

class UpperCase {
    public void toUpperCase(char ch[]) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 97 && ch[i] <= 122) {
                int result = (int) (ch[i] - 32);
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
        System.out.println("Enter the String in lower case ");
        String s = sc.nextLine();

        char[] ch = s.toCharArray();
        UpperCase obj = new UpperCase();
        obj.toUpperCase(ch);

    }
}