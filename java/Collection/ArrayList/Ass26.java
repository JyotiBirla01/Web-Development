/*Suppose a one-dimensional array AR containing integers is arranged in ascending order. Write a java program to search for an integer from AR with the help of Binary search method */

import java.util.ArrayList;
import java.util.Scanner;

public class Ass26 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        System.out.println("Enter the number to search ");
        int element = sc.nextInt();
        int low = 0, high = n - 1, mid;
        boolean flag = false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (element == al.get(mid)) {
                flag = true;
                break;
            } else if (element > al.get(mid)) {
                low = mid + 1;

            } else
                high = mid - 1;

        }

    }
}