
import java.util.Scanner;

public class Ass7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of class held");
        float c = sc.nextInt();
        System.out.println("Number of classes attended");
        float a = sc.nextInt();
        float per = (a / c) * 100;
        System.out.println(per + "% of class attended");
        if (per < 75) {
            System.out.println("Student is not allowed to sit in the exam");
        } else {
            System.out.println("Student is  allowed to sit in the exam");
        }
    }

}
