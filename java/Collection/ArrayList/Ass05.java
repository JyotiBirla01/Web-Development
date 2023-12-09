
//Q.5 Find the kth largest and kth smallest element in array.
import java.util.ArrayList;
import java.util.Scanner;

public class Ass05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + "element");
            al.add(sc.nextInt());

        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int i, j,smallest=0,largest=0;
        int size = 0;
        System.out.println("Sorting element");
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (al.get(i) > al.get(j)) {
                    int temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);

                }
            }
            System.out.println(al.get(i));

        }
        System.out.println("Distinct element");

        for (i = 0; i < n; i++) {
            for (j = 0; j < i + 1; j++) {
                if (al.get(i) == al.get(j))
                    break;
            }
            if (i == j) {
                size = al.size();
               // System.out.println(al.get(i));
                smallest=al.get(k);
                largest=al.get(size-k);
            }
        }

        System.out.println(k + " th largest element " + largest);
        System.out.println(k + " th smallest element " + smallest);
    }
}
