
/*28. P is one-dimensional array of integers. Write a Java program search for a 
data VAL from P. If VAL is present in the array then “element found ” otherwise “element 
not found” should be displayed. 
*/
import java.util.Scanner;

public class Array28 {
    public String search(int n, int a[], int value) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value)
                flag = true;

        }
        if (flag)
            return "Element found ";
        else
            return "Element not found ";

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the value");
        int value = sc.nextInt();
        Array28 obj = new Array28();

        String result = obj.search(n, a, value);
        System.out.println(result);

    }
}