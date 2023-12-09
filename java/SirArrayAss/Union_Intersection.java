import java.util.Scanner;

public class Union_Intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element of array1");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the size of array2");
        int m = sc.nextInt();
        int b[] = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.println("Enter the " + (i + 1) + " element of array2");
            b[i] = sc.nextInt();
        }

        int c[] = new int[a.length + b.length];
        int i, j;
        for (i = 0, j = 0; i < a.length + b.length; i++) {
            if (i < a.length) {
                c[i] = a[i];
            } else {
                c[i] = b[j];

                j++;
            }
        }
        System.out.println("Merge of array ");
        for (i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        // Union of Array
        int count = 0;
        for (i = 0; i < c.length; i++) {
            for (j = 0; j < i + 1; j++) {
                if (c[i] == c[j])
                    break;
            }
            if (i == j) {
                count++;
            }

        }
        System.out.println("count of union is  " + count);

        int intercount = 0;
        for (i = 0; i < a.length + b.length; i++) {
            for (j = i + 1; j < a.length + b.length; j++) {
                if (c[i] == c[j]) {
                    intercount++;
                }
            }

        }
        System.out.println("Count of intersection is " + intercount);
    }
}