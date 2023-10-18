import java.util.Scanner;

public class FahTocelcius {
    public double check(double fehrenite) {
        double calcius = (fehrenite - 32) * 5 / 9;
        return calcius;
    }

}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in fehrenite");
        double fehrenite = sc.nextInt();

        FahTocelcius obj = new FahTocelcius();
        double ans = obj.check(fehrenite);
        System.out.println(ans);

    }
}