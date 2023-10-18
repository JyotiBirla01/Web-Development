
//Find the first repeating element in array of integers
import java.util.Scanner;

public class FirstRepeatingEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in  array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        int i, j;
        boolean flag = false;
        System.out.print("First repeating element is : ");
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println(a[i]);
                break;
            }

        }

    }

}
