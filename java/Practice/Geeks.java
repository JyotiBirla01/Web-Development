import java.util.Scanner;

class Solution {

    static int mod = 1000000007;

    // int nthFibonacci(int n) {
    // // prestoring
    // int dp[] = new int[n+1 ];
    // // initializing dp[0] as 0
    // dp[0] = 0;
    // // initializing dp[1] as 1
    // dp[1] = 1;
    // for (int i = 2; i <= n; i++) {
    // // as same as fibonacci formula f(i)=f(i-1)+f(i-2)
    // dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
    // }
    // // returning nth value
    // return dp[n];
    // }
    int s = 0,s1=0;

    int   sum(int n) {
        for (int i = 1; i <=n; i++) {
         s=n*(n+1)/2;
    }
      //System.out.println(s1);
      return s;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        Solution obj = new Solution();
        // System.out.println(obj.nthFibonacci(n));
       System.out.println(obj.sum(n));
      //obj.sum(n);
    }
}