//Q.4 Write a program to sort the array

import java.util.ArrayList;
import java.util.Scanner;

public class Ass04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element in array ");
            al.add(sc.nextInt());

        }

        int i = 0, j = 0;
        for ( i = 0; i < n; i++) {
            for ( j = i + 1; j < n; j++) {
                if (al.get(i) > al.get(j)) {
                    int temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);

                }
            }
           System.out.println(al.get(i));

        }
        

    }

}