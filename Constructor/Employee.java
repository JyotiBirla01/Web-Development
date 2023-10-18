
// Q 9 Write a program by creating an 'Employee' class having the following methods and print 
// the final salary.
// 1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as 
// parameter
// 2 - 'AddSal()' which adds 10000 to salary of the employee if it is less than 50000.
// 3 - 'AddWork()' which adds 5000 to salary of employee if the number of hours of work per day 
// is more than 6 hours.
import java.util.Scanner;

public class Employee {

    int salary;
    float time;

    void getInfo(int salary, float time) {
        this.salary = salary;
        this.time = time;
    }

    void AddSal() {

        if (salary < 50000) {
            salary = salary + 10000;
            System.out.println((salary));
        } else
            System.out.println(salary);

    }

    void AddWork() {
        if (time > 6) {
            salary = salary + 5000;
            System.out.println((salary));
        } else
            System.out.println(salary);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary");
        int salary = sc.nextInt();
        System.out.println("Enter the time");
        int time = sc.nextInt();

        Employee obj = new Employee();
        obj.getInfo(salary, time);
        obj.AddSal();
        obj.AddWork();
    }

}
