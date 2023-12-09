
import java.util.Scanner;

class SumOfInteger {
    public int m1(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 7 == 0)
                sum = sum + i;
        }
        return sum;
    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOfInteger obj = new SumOfInteger();
        int ans = obj.m1(100, 200);
        System.out.println(ans);

    }

}
