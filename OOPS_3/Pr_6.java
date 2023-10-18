
/* Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods
 to calculate and update salary.
*/
import java.util.Scanner;

class Employee {
    private String name;
    private String jobTitle;
    private float salary;

    public Employee(String name, String jobTitle, float salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public float updateSalary(float newSalary) {
        salary = newSalary;
        return salary;

    }

    public float calculateSalary(float percentage) {
        float incrementAmount = salary * (percentage / 100);
        salary += incrementAmount;
        return salary;

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name ");
        String name = sc.nextLine();
        System.out.println("Enter hte job title ");
        String jobTitle = sc.nextLine();

        System.out.println("Enter the salary ");
        float salary = sc.nextFloat();
        System.out.println("Enter the new salary ");
        float newSalary = sc.nextFloat();
        System.out.println("Enter the increased percentage of salary ");
        float percentage = sc.nextFloat();
        Employee obj = new Employee(name, jobTitle, salary);
        System.out.println("Updated salary " + obj.updateSalary(newSalary));

        System.out.println(" calculate Salary " + obj.calculateSalary(newSalary));
    }
}