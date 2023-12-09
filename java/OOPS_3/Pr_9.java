import java.util.Scanner;
import java.time.LocalDate;

class Employee {
    private String name;
    private int salary;
    private String hireDate;
    private String currentDate;
    // private int day ,year,month;

    public Employee() {

    }

    public Employee(String name, int salary, String hireDate, String currentDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.currentDate = currentDate;
    }

    public void getDayMonthYear() {

        LocalDate date = LocalDate.parse(hireDate);
        LocalDate date1 = LocalDate.parse(currentDate);
        int day = date1.getDayOfMonth() - date.getDayOfMonth();
        int year = date1.getYear() - date.getYear();
        int month = date1.getMonthValue() - date.getMonthValue();
        
        System.out.println(
                name + "\t\t" + salary + "\t\t" + hireDate + "\t\t" + currentDate + "\t\t" + year + "\t\t" + month + "\t\t"+day);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employee ");
        int n = sc.nextInt();
        Employee obj[] = new Employee[n];
        for (int i = 0; i < n; i++) {

            System.out.println("Enter the name of  " + (i + 1) + " Employee ");
            String name1 = sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter the salary " + (i + 1) + " Employee ");
            int salary = sc.nextInt();
            System.out.println("Enter the hire date of  " + (i + 1) + " Employee in this formate yyyy-MM-dd");
            String hireDate = sc.next();
            System.out.println("Enter the current date  of " + (i + 1) + " Employee in this formate yyyy-MM-dd ");
            String currentDate = sc.next();

            obj[i] = new Employee(name, salary, hireDate, currentDate);
        }
        System.out.println("\n------------------------------------------------------------------------------------------");
        System.out.print("Employee Name\tsalary \thire Date \tcurrent date  ");
        System.out.println(("\tyear \t month \tday   "));
        for (int i = 0; i < obj.length; i++) {
            obj[i].getDayMonthYear();
        }
    }
}