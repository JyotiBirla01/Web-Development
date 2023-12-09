
import java.util.Scanner;

class Ass8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your medical cause  Y/N ");
        char ch = sc.next().charAt(0);
        if (ch == 'Y') {
            System.out.println("Student is  allowed to sit in the exam");
        } else {
            System.out.println("Student is  not allowed to sit in the exam");
        }

    }
}