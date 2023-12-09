import java.util.Scanner;

class Ass14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage");
        float percentage = sc.nextFloat();
        if (percentage > 90)
            System.out.println(" Grade is A");
        else if (percentage > 80 && percentage <= 90)
            System.out.println(" Grade is B");
        else if (percentage >= 60 && percentage <= 80)
            System.out.println(" Grade is C");
        else
            System.out.println(" Grade is D");

    }

}
