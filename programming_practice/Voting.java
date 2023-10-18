
import java.util.Scanner;

class Voting {
    public void check(int age) {
        if (age >= 18 && age <= 100)
            System.out.println("Elligible for vote ");
        else
            System.out.println("Not elligible for vote ");
    }

}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age  ");
        int age = sc.nextInt();
        Voting obj = new Voting();
        obj.check(age);

    }
}