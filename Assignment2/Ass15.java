import java.util.Scanner;

class Ass15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price of bike ");
        int costprice = sc.nextInt();
        int tax = 0;
        if (costprice > 100000)
            System.out.println("Tax to  be paid is " + (costprice) * 15 / 100);
        else if (costprice > 50000 && costprice <= 100000)
            System.out.println("Tax to  be paid is " + (costprice) * 10 / 100);
        else if (costprice <= 50000)
            System.out.println("Tax to  be paid is " + (costprice) * 5 / 100);

    }
}
