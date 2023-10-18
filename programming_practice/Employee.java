import java.util.Scanner;

class Employee {
    private int yearOfJoining, salary;
    private String name;
    private String address;

    public Employee(String name, int yearOfJoining, int salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;

    }

    public Employee() {

    }

    public void display() {
        System.out.println(
                "Name     " + name + "     Year of joining  " + yearOfJoining + "     salary    " + salary
                        + "     Address   " + address);

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e[] = new Employee[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the name of employee");
            String name = sc.next();
            System.out.println("Enter the year of joining ");
            int yearOfJoining = sc.nextInt();
            System.out.println("Enter the address ");
            String address = sc.next();
            System.out.println("Enter the salary");
            int salary = sc.nextInt();
            e[i] = new Employee(name, yearOfJoining, salary, address);
        }
        for (int i = 0; i < 3; i++) {
            e[i].display();

        }

    }
}