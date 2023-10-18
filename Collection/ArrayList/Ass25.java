// P is one-dimensional array of integers. Write a Java program search for a data VAL from P. If VAL is present in the array then element found otherwise element not found should be displayed.  

import java.util.ArrayList;
import java.util.Scanner;

public class Ass25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        System.out.println("Enter the element to search");
        int element = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (al.get(i) == element) {
                System.out.println("Element found ");
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Element not found");
        }
    }
}
