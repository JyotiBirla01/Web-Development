//Q.10.Write a program to cyclically rotate array by one.

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

class Ass12 {
    public void kthElement(ArrayList<Integer> al, int k, int n) {
        k = k % n; 
        int i = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (i = n - k; i < n; i++) {
            arr.add(al.get(i)); 
        }
        for (i = 0; i < n - k; i++) {
            arr.add(al.get(i)); 
        }
        for (i = 0; i < n; i++) {
            System.out.println(arr.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        ArrayList<Integer> al = new ArrayList<>(n);
        System.out.println("Enter elements ");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        System.out.println("Enter kth element");
        int k = sc.nextInt();
        Ass12 obj = new Ass12();
        obj.kthElement(al, k, n);
    }
}
