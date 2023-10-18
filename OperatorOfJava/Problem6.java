//Calculate sum of three number example 132= 1+3+2=6
public class Problem6 {
    public static void main(String[] args) {
        int num = 132, a, b, c, d, e;
        a = num / 100;
        b = num / 10;
        c = b % 10;
        d = num % 10;
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        e = a + c + d;
        System.out.println(e);

    }
}
