import java.util.Scanner;

public class fibonic {
    static int mod = 1000000007;

    public int nthFibonacci(int n) {

        // code here
        int a = -1, b = 1, c = 0, i;
        int num = n;
        boolean flag = false;
        for (i = 0; i <= n; i++) {
            c = (a + b) % mod;
            a = b;
            b = c;

        }
        return c;
    }
}
// System.out.println("Enter the number ");
// int n = sc.nextInt();
// class Solution {
// int count(int[] arr, int n, int x) {
// int i, count = 0;
// boolean flag= false;
// for (i = 0; i < n; i++) {
// if (arr[i] == x) {
// count++;
// flag= true;
// }

// }
// if (flag)
// return count;
// else
// return 0;
// }
// }
// class Main{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int arr[] = new int[n];
// System.out.println("Enter the element ");
// for (int i = 0; i < arr.length; i++) {
// arr[i]= sc.nextInt();
// }
// System.out.println("Enter the value of x");
// int x = sc.nextInt();
// Solution obj = new Solution();
// System.out.println(obj.count(arr, n, x));

// }

// }
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        fibonic obj = new fibonic();
        System.out.println(obj.nthFibonacci(n));
    }
}
