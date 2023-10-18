
//Find even odd using switch case 
import java.util.Scanner;

class Ass211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int p = n % 2;

        switch (p) {
            case 0:
                System.out.println("even");

                break;
            case 1:
            case -1:
                System.out.println("Odd");
                break;

        }

    }

}
