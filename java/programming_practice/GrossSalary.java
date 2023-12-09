
import java.util.Scanner;

public class GrossSalary {
    public void finalSalary(double basicSalary, char grade) {
        double gs, allow;
        double hra = (basicSalary * 20) / 100;
        double da = (basicSalary * 50) / 100;
        double pf = (basicSalary * 11) / 100;
        switch (grade) {
            case 'A':
                allow = 1700;
                gs = basicSalary + hra + da + allow - pf;
                System.out.println(gs);
                break;
            case 'B':
                allow = 1500;
                gs = basicSalary + hra + da + allow - pf;
                System.out.println(gs);
                break;
            case 'C':
                allow = 1700;
                gs = basicSalary + hra + da + allow - pf;
                System.out.println(gs);
                break;
            default:
                System.out.println("Invalid grade");

        }

    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary");
        double basicSalary = sc.nextDouble();
        System.out.println("Enter the grade");
        char grade = sc.next().charAt(0);
        GrossSalary obj = new GrossSalary();
        obj.finalSalary(basicSalary, grade);

    }

}
