//Q.5 Find occurance of an integer number in array.

import java.util.ArrayList;
import java.util.Scanner;

public class Ass06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());

        }
        System.out.println("Enter the number which you want to count ");
        int occurence = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (al.get(i) == occurence)
                count++;
        }
        System.out.println("Occurence of element is " + count);
        al.add(100);

    }

}
