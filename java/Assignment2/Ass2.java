import java.util.Scanner;

class Ass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of purchased quantity");
        int cost = sc.nextInt();
        if (cost > 1000) {
            float discount = ((cost) * 10 / 100);
            float total = cost - discount;
            System.out.println("Total cost is " + total);
        } else {
            float total = cost;
            System.out.println("Total cost is " + total);
        }
    }

}
