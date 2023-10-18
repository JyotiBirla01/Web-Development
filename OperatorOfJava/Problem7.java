// Reverse a number 
public class Problem7 {
    public static void main(String[] args) {
        int num = 123, a, b, c, wholenum;
        a = num / 100;
        System.out.println(a);
        b = num % 10;
        System.out.println(b);
        c = (num / 10) % 10;
        System.out.println(c);
        wholenum = b * 100 + c * 10 + 1;
        System.out.println("The reverse number is :- " + wholenum);

    }
}
