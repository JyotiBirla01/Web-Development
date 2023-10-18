
//Swapping of a number 
import java.util.Scanner;

class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :- ");
        float a = sc.nextFloat();
        System.out.println("Enter the value of b :- ");
        float b = sc.nextFloat();
        float c;

        // Using third variable
        c = a;
        a = b;
        b = c;
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);

    }
}
