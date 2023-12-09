import java.util.Scanner;

class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number of days ");
        float days = sc.nextInt();
        float m = days / 30;
        System.out.println("The number of month is " + m);
        float w = (days % 30) / 7;
        System.out.println("The number of weeks is " + w);
        float d = (days % 30) % 7;
        System.out.println("The number of weeks is " + w);

    }

}
