
// 15) Create a class MathOperation containing method ‘multiply’ to calculate 
// multiplication of following arguments.
// two integers
// three float
// all elements of array
// one double and one integer
import java.util.Scanner;

public class MathOperation15 {
    public void multiply(int a, int b) {
        System.out.println("Multiplication of two integer " + (a * b));

    }

    public void multiply(float a, float b, float c) {
        System.out.println("Multiplication of three float " + (a * b * c));
    }

    public void multiply(int... a) {
        int product = 1;
        for (int i = 1; i < a.length; i++) {
            product *= a[i];

            System.out.println((a[i]));
        }
    }

    public void multiply(double a, int b) {
        System.out.println("Multiplication of one double and one integer " + (a * b));
    }

}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        MathOperation15 obj = new MathOperation15();
        obj.multiply(10, 20);
        obj.multiply(1.2f, 3.5f, 4.6f);
        System.out.println("MUltiplication of the element of array ");
        obj.multiply(12, 13, 14, 15, 16);
        obj.multiply(12.4, 5);
    }
}