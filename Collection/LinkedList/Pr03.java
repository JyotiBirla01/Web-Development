import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Pr03 {
    public static void main(String[] args) {
        LinkedList<Double> f = new LinkedList<>();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the elements ");
        f.add(21.3);
        f.add(1.0);
        f.add(4.0);
        f.add(7.8);
        // for (Double double1 : f) {
        // System.out.println(double1);
        // }
        ListIterator<Double> li = f.listIterator();
        while (li.hasNext()) {
            double element = li.next();
            System.out.println(element);
        }

    }

}
