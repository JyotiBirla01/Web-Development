// Q 9 Write a program by creating an 'Employee' class having the following methods and print 
// the final salary.
// 1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as 
// parameter
// 2 - 'AddSal()' which adds 10000 to salary of the employee if it is less than 50000.
// 3 - 'AddWork()' which adds 5000 to salary of employee if the number of hours of work per day 
// is more than 6 hours.
public class Employee {
    void getInfo(int salary, float time) {

    }

    void AddSal() {
        int salary;
        if (salary < 50000)
            System.out.println(salary + 10000);

    }

    void AddWork() {
        int time, salary;
        if (time > 6) {
            
            System.out.println(salary + 5000);
        }
    }

    public static void main(String args[]) {

        Employee obj = new Employee();
        obj.getInfo(100000, 5);
        obj.AddSal();
        obj.AddWork();
    }

}
