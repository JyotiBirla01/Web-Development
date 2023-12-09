/*Q.16
Rearrange the array in alternating positive and negative items
Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with positive number.

Example 1:
Input: 
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
Example 2:
Input: 
N = 10
Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output:
5 -5 2 -2 4 -8 7 1 8 0  */

import java.util.ArrayList;
import java.util.Scanner;

public class Ass17 {
    public void alternatePositiveNegative(ArrayList<Integer> al1, ArrayList<Integer> al2) {
        for (int i = 0; i < al1.size(); i++) {
            if (i % 2 == 0 && al1.get(i) >= 0) {
                al2.add(al1.get(i));
            } else if (i % 2 != 0 && al1.get(i) < 0) {
                al2.add(al1.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            al1.add(sc.nextInt());
        }

        ArrayList<Integer> al2 = new ArrayList<>();
        Ass17 obj = new Ass17();
        obj.alternatePositiveNegative(al1, al2);

        System.out.println("Resulting array:");
        for (int num : al2) {
            System.out.print(num + " ");
        }
    }
}
