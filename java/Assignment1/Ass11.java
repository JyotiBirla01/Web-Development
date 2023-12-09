import java.util.Scanner;

public class CI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rate :- ");
        float rate = sc.nextFloat();
        System.out.println("Enter the principle :- ");
        float principle = sc.nextFloat();
        System.out.println("Enter the time :- ");
        float time = sc.nextFloat();
        System.out.println("Enter the number of times  that interset is compounded per unit :- ");
        float n = sc.nextFloat();
        double amount = (principle * Math.pow(1 + (rate / n), n * time));
        double ci = amount - principle;
        System.out.println("Compound interest is :- " + ci);

    }

}
