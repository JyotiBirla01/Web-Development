
//Q.6 Sort the array of 0s , 1s and 2s.
import java.util.ArrayList;
import java.util.Scanner;

public class Ass07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>(n);
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        int i = 0, count1 = 0, count2 = 0, count3 = 0;
        while (i < n) {
            if (al.get(i) == 0)
                count1++;
            if (al.get(i) == 1)
                count2++;
            if (al.get(i) == 2)
                count3++;
            i++;

        }
        i = 0;
        while (count1 > 0) {
            int a = al.get(i);
            a = 0;
            count1--;
            i++;
        }
        while (count2 > 0) {
            int b = al.get(i);
            b = 0;
            count2--;
            i++;
        }
        while (count3 > 0) {
            int c = al.get(i);
            c = 0;
            count3--;
        }
        for (int j = 0; j < n; j++) {
            System.out.println(al.get(j));
        }
    }

}
