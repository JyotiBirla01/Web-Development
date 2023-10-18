//24. Write a Java program to swap first and last element of an integer 1-d array.

import java.util.ArrayList;
import java.util.Scanner;

public class Ass24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        System.out.println("After swappinng first and last element ");
        for (int i = 0; i < n; i++) {
            int temp = al.get(0);
            al.set(0, al.get(n - 1));
            al.set(n - 1, temp);
            System.out.println(al.get(i));

        }
    }
}
