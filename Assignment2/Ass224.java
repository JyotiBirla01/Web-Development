
//Write a Java program to count total number of notes in given amount.
import java.util.Scanner;

public class Ass224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount ");
        int amount = sc.nextInt();
        int note1, note2, note5, note10, note20, note50, note100, note200, note500;

        if (amount >= 500) {
            note500 = amount / 500;
            amount -= note500 * 500;
            System.out.println("Tne number of 500 notes is " + note500);
        }
        if (amount >= 200) {
            note200 = amount / 200;
            amount -= note200 * 200;
            System.out.println("Tne number of 200 notes is " + note200);
        }
        if (amount >= 100) {
            note100 = amount / 100;
            amount -= note100 * 100;
            System.out.println("Tne number of 100 notes is " + note100);
        }
        if (amount >= 50) {
            note50 = amount / 50;
            amount -= note50 * 50;
            System.out.println("Tne number of 50 notes is " + note50);
        }
        if (amount >= 20) {
            note20 = amount / 20;
            amount -= note20 * 20;
            System.out.println("Tne number of 20 notes is " + note20);
        }
        if (amount >= 10) {
            note10 = amount / 10;
            amount -= note10 * 10;
            System.out.println("Tne number of 10 notes is " + note10);
        }
        if (amount >= 5) {
            note5 = amount / 5;
            amount -= note5 * 5;
            System.out.println("Tne number of 5 notes is " + note5);
        }
        if (amount >= 2) {
            note2 = amount / 2;
            amount -= note2 * 2;
            System.out.println("Tne number of 2 notes is " + note2);
        }
        if (amount >= 1) {
            note1 = amount;
            System.out.println("Tne number of 1 notes is " + note1);
        }

    }

}
