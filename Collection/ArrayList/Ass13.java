/*Q.12
Find common elements in three sorted arrays.
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?
Example 1:
Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C. */

import java.util.ArrayList;
import java.util.Scanner;

class Ass13 {
    public void commonElement(ArrayList<Integer> al1, ArrayList<Integer> al2, ArrayList<Integer> al3) {
        for (int i = 0; i < al1.size(); i++) {
            for (int j = 0; j < al2.size(); j++) {
                for (int j2 = 0; j2 < al3.size(); j2++) {
                    if (al1.get(i) == al2.get(j) && al2.get(j) == al3.get(j2) && al3.get(j2) == al1.get(i))
                        System.out.println(al1.get(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        ArrayList<Integer> al3 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("For exit enter 0 ");
        System.out.println("Enter the elements in arrayList 1");
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            al1.add(n);
        }
        System.out.println("Enter the elements in arrayList 2");
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            al2.add(n);
        }
        System.out.println("Enter the elements in arrayList 3");
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            al3.add(n);
        }
        Ass13 obj = new Ass13();
        System.out.println("Common element is ");
        obj.commonElement(al1, al2, al3);
    }
}