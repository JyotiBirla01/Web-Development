
import java.util.Scanner;

public class Check {
    public void m1(double sales) {
        double bonus = (sales * 20) / 100;
        if (sales > 10000) {

            System.out.println(sales + bonus);

        } else {
            System.out.println(sales);
        }

    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sales ");
        double sales = sc.nextDouble();

        Check obj = new Check();
        obj.m1(sales);

    }

}
