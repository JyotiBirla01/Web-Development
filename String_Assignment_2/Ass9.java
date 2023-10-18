
//9. Write a Java program to check whether two String objects contain the same data
import java.util.Scanner;

class ContainSameData {
    public void equal(char ch1[], char ch2[]) {
        boolean flag = false;

        for (int i = 0; i < ch1.length; i++) {
            for (int j = 0; j < ch2.length; j++) {
                if (ch1[i] == ch2[j]) {
                    flag = true;
                    System.out.println(flag);
                    break;

                } else {
                    System.out.println(flag);
                    break;
                }
            }
            if (flag = true)
                break;
            else
                break;

        }
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first  String ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second String");
        String s2 = sc.nextLine();

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        ContainSameData obj = new ContainSameData();
        obj.equal(ch1, ch2);

    }
}