
//Swapping of a number 
import java.util.Scanner;

class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :- ");
        float a = sc.nextFloat();
        System.out.println("Enter the value of b :- ");
        float b = sc.nextFloat();

        // without using third variable
        b = b - a;
        a = b + a;
        b = -(b - a);
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);

    }
}
