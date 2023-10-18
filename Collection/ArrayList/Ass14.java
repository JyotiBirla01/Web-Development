/*Q.13
Find the first repeating element in array of integers */

import java.util.ArrayList;
import java.util.Scanner;

public class Ass14 {
    public Integer repeating(ArrayList<Integer> al) {

        int i = 0, j = 0;
        for (i = 0; i < al.size(); i++) {
            for (j = i + 1; j < al.size(); j++) {
                if (al.get(i) == al.get(j))
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
        Ass14 obj = new Ass14();

        int result = obj.repeating(al);
        if (result != 0)
            System.out.println("First repeating element is " + result);
        else
            System.out.println("No repeating element ");
    }

}
