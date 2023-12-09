//Swapping of a number 
public class Problem3 {
    public static void main(String[] args) {
        int a = 10, b = 5, c;
        // Using third variable
        // c = a;
        // a = b;
        // b = c;
        // System.out.println("The value of a is " + a);
        // System.out.println("The value of b is " + b);

        // without using third variable
        b = b - a;
        a = b + a;
        b = -(b - a);
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);

    }
}
