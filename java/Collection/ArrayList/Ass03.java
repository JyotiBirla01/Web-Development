/*Q.3 Write a program to reverse the array. */

import java.util.ArrayList;
import java.util.Scanner;

public class Ass03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);
        System.out.println("Enter the elements in array "); 
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());

        }
        System.out.println("Reverse array is ");
        // for (int i = n-1; i>=0; i--) {
        // System.out.println(al.get(i));

        // }
       // al.add(10);
       // al.add(20);
        for (int i = 0; i < n / 2; i++) {
            int temp = al.get(i);
            al.set(i, al.get(al.size() - i - 1));
            al.set(al.size() - i - 1, temp);
           
        }
            for (int j = 0; j < n; j++) {
                System.out.println(al.get(j));
            }

        //}
    }

}
