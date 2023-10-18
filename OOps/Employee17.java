
// 17) Create a class Employee with(empNo ,salary and totalSalary)  with following 
// 	features.
// Only parameterized constructor;
// totalSalary always represent total of all the salaries of all employees created.
// empNo should be auto incremented.
// display total employees and totalSalary using class method.
import java.util.Scanner;

public class Employee17 {
    private int empNo, salary, totalSalary;

    public Employee17(int emyArray[], int salaryArray[]) {
        this.empNo = emyArray.length;

        for (int i = 0; i < salaryArray.length; i++) {
            totalSalary += salaryArray[i];
        }

    }

    public void display() {
        System.out.println(empNo);
        System.out.println(totalSalary);
    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee number ");
        int emyNo = sc.nextInt();
        int emyArray[] = new int[emyNo]; 
        emyArray[0] = 1;
        for (int i = 1; i < emyNo; i++) {
            emyArray[i]++;
        }
        System.out.println("Enter the salary ");

        int salaryArray[] = new int[emyNo];
        for (int i = 0; i < emyNo; i++) {
            salaryArray[i] = sc.nextInt();

        }
        Employee17 obj = new Employee17(emyArray, salaryArray);
        obj.display();

    }

}
