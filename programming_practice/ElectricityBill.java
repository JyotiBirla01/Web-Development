
import java.util.Scanner;

public class ElectricityBill {
    public void bill(int u) {
        if (u >= 1 && u < 100)
            System.out.println(u * 10 + " RS");
        else if (u > 100 && u < 200)
            System.out.println(u * 15 + " Rs");
        else if (u > 200 && u < 300)
            System.out.println(u * 20 + " Rs");
        else
            System.out.println(u * 25 + " Rs");

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units ");
        int u = sc.nextInt();
        ElectricityBill obj = new ElectricityBill();
        obj.bill(u);

    }
}