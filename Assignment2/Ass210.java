
// Print number between 1 to 5 in word format 
import java.util.Scanner;

class Ass210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 5");
        int n = sc.nextInt();
        switch (n) {
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Invalid number !");

        }

    }

}
