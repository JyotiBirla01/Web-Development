import java.util.Scanner;

class Ass3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year of services ");
        int services = sc.nextInt();
        System.out.println("Enter your salary");
        int salary = sc.nextInt();
        if (services > 5) {
            int bonus = ((salary) * 5 / 100);
            System.out.println("Bonus is " + bonus);
            System.out.println(" Net Bonus  amount is " + (bonus + salary));
        }

    }

}
