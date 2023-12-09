import java.util.Scanner;

class Employee {
    protected int empNo, salary, phone;
    protected String eName;

    public Employee(int empNo, String eName, int salary, int phone) {
        this.empNo = empNo;
        this.eName = eName;
        this.salary = salary;
        this.phone = phone;
    }

    public Employee() {

    }

    public void display() {

        System.out.println(empNo + "\t\t" + eName + "\t\t" + salary + "\t\t" + phone);
 
    }
}

class MainEmployee extends Employee {

 
    public void sortEmployee(Employee obj[]) {
        for (int i = 0; i < obj.length; i++) {
            for (int j = i + 1; j < obj.length; j++) {
                if ((obj[i].salary) >= (obj[j].salary)) {
                    Employee temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;  
                }

            }

        }
        for (int i = 0; i < obj.length; i++) {
            obj[i].display();

        }

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employee");
        int n= sc.nextInt();
        Employee obj[] = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the empoyee number ");
            int empNo = sc.nextInt();
            System.out.println("Enter employee name");
            String eName = sc.next();
            System.out.println("Enter the empoyee salary ");
            int salary = sc.nextInt();
            System.out.println("Enter the empoyee phone number ");
            int phone = sc.nextInt();
            obj[i] = new Employee(empNo, eName, salary, phone);
        }
        System.out.println("-------------------Employee  detail ---------------------------------");
System.out.println("EmpNumber\t\tName\t\tsalary\t\tphone ");
        
        MainEmployee obj2 = new MainEmployee();
        obj2.sortEmployee(obj);
    }
} 