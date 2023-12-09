
/*13) Explain the importance of toString() and equals() method of the Object class and override
 them on class Employee (empId,name,salary).Create class for main method(say XYZ),and accept
  five employees information and store in an array. Also ensure if entered empId already exist
   or not (use equals method).Display all employee info using toString() method. */
import java.util.Scanner;

class Employee {
    private int empId;
    private String name;
    private float salary;

    public Employee(int empId, String name, float salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;

    }

    public String toString() {
        return ("Employee Id " + empId + "\nName " + name + "\nSalary " + salary);

    }

    public int getid() {

        return empId;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employee");
        int n = sc.nextInt();
        int count = 0;
        Employee emp[] = new Employee[n];
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Enter the employee id ");
            int empId = sc.nextInt();
            System.out.println("Enter the name");
            String name = sc.next();
            System.out.println("Enter the salary");
            float salary = sc.nextFloat();
            boolean flag = true;
            for (int j = 0; j < count; j++) {
                int k = emp[j].getid();
                if (k == empId) {
                    flag = false;
                    System.out.println("\tEmpoyee Id is already exist\t");
                    break;
                }
            }
            if (flag) {
                emp[i] = new Employee(empId, name, salary);
                count++;

            } else
                i--;

        }
        for (int i = 0; i < count; i++) {
            emp[i].toString();
        }

    }
}
