//Q.13
//Find the first repeating element in array of integers

import java.util.Scanner;

public class Array14 {
    public void firstRepeating(int n, int a[]) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element of array ");
            a[i] = sc.nextInt();
        }
        System.out.println("Your output is ");
        Array14 obj = new Array14();
        obj.firstRepeating(n, a);

    }
}
