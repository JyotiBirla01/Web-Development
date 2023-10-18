
/*Q.9 Find the Union and Intersaction of two sorted array.
Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays. 
Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
Example 1:
Input:
5 3
1 2 3 4 5
1 2 3
Output: 
5
Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
Example 2:
Input:
6 2 
85 25 1 32 54 6
85 2 
Output: 
7
Explanation: 
85, 25, 1, 32, 54, 6, and
2 are the elements which comes in the
union set of both arrays. So count is 7. */
import java.util.ArrayList;


public class Ass10 {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(10);
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);
        al1.add(60);
        ArrayList<Integer> al2 = new ArrayList<>(10);
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);
        ArrayList<Integer> al3 = new ArrayList<>(10);
        al3.addAll(al1);
        al3.addAll(al2);

        int i, j, count = 0;
        System.out.println("Union of array is ");
        for (i = 0; i < al3.size(); i++) {
            for (j = 0; j < i + 1; j++) {
                if (al3.get(i) == al3.get(j)) {
                    break;
                }

            }
            if (i == j) {
                count++;
                System.out.println(al3.get(i));
               
            }

        }
        System.out.println("Intersection of array list is ");
        for (i = 0; i < al1.size(); i++) {
            for (j = 0; j < al2.size(); j++) {
                if (al1.get(i) == al2.get(j))
                    System.out.println(al3.get(i));
                   // break;
            }
        }

    }
}