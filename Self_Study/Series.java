import java.util.*;

class Series {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int t = in.nextInt();

        int a = in.nextInt();
        System.out.println("Enter the value of b");
        int b = in.nextInt();
        System.out.println("Enter the value of n");
        double n = in.nextInt();
        int sum = a;
        for (int i = 0; i <= n; i++) {
            sum = (int) (sum + (Math.pow(2, i) * b));
            // for (int j = 0; j < t; j++) {
            // sum = (int) (sum + (Math.pow(2, j) * b));
            System.out.println(sum);

            // }
        }
    }
}