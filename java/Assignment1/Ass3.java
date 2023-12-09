import java.util.Scanner;

class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of a person:- ");
        int age = sc.nextInt();
        int limit = 18;
        String x = (age >= limit) ? "Elligible" : "Not Elligible";

        System.out.println(x);

    }
}