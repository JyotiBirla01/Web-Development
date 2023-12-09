
/*22. Write a Java program to return the sum of the digits present in the given string. 
If there is no digits the sum return is 0 */
import java.util.Scanner;

public class Ass22 {
    public void sumOfDigits(String s) {

        int number = Integer.parseInt(s);
        int rem, sum = 0;
        while (number != 0) {
            rem = number % 10;
            sum += rem;
            number /= 10;
        }
        System.out.println(sum);

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        // char ch[] = s.toCharArray();

        Ass22 obj = new Ass22();
        obj.sumOfDigits(s);

    }
}