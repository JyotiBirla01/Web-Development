/*Q.14. Find the first non-repeating elment in given array of integers
Find the first non-repeating element in a given array arr of N integers.
Note: Array consists of only positive and negative integers and not zero.
Example 1:
Input : arr[] = {-1, 2, -1, 3, 2}
Output : 3
Explanation:
-1 and 2 are repeating whereas 3 is 
the only number occuring once.
Hence, the output is 3.

Example 2:
Input : arr[] = {1, 1, 1}
Output : 0 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ass15 {
    public Integer nonRepeating(ArrayList<Integer> al) {
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < al.size(); i++) {
            count = 0;
            for (int j = 0; j < al.size(); j++) {
                if (al.get(i) == al.get(j)) {
                    count++;

                }

            }
            if (count < 2) {
                flag = true;
                return al.get(i);

            }
        }

        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("For exit enter 0 ");
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            al.add(n);
        }
        Ass15 obj = new Ass15();
        int result = obj.nonRepeating(al);
        if (result != 0)
            System.out.println("First non repeating element " + result);
        else
            System.out.println("No non repeating element ");
    }

}
