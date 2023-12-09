
// 17) Create a class Employee with(empNo ,salary and totalSalary)  with following 
// 	features.
// Only parameterized constructor;
// totalSalary always represent total of all the salaries of all employees created.
// empNo should be auto incremented.
// display total employees and totalSalary using class method.
import java.util.Scanner;

public class Employee171 {
    private static int empNo;
    private int salary;
    private static int totalSalary;

    public Employee171(int salary) {
        this.empNo++;
        this.salary = salary;
        this.totalSalary = totalSalary + salary;

    }

    public Employee171() {

    }

    // public void display() {
    // System.out.println(salary);

    // }

    public static void displayTotal() {
        System.out.println("Total Salary " + totalSalary);
    }

    public static void displayEmpNO() {
        System.out.println(" Total Employee " + empNo);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee171 e[] = new Employee171[6];
        for (int i = 0; i < e.length; i++) {
            System.out.println("Enter the " + (i + 1) + " Salary");
            int salary = sc.nextInt();
            e[i] = new Employee171(salary);

        }
        Employee171.displayEmpNO();

        // for (int i = 0; i < 6; i++) {
        // e[i].display();

        // }
        Employee171.displayTotal();
    }

}