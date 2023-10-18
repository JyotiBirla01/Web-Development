
// Converting Fahrenheit to celcius
import java.util.Scanner;

public class Ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit :- ");

        int f = sc.nextInt();
        int c;

        c = (f - 32) * 5 / 9;
        System.out.println("The temperature in c is :- " + c);
    }
}
