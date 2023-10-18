class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Employee {
    private String name;
    private Department department; // Aggregation

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}

public class Main {
    public static void main(String[] args) {
        Department hr = new Department("HR");
        Employee employee = new Employee("John Doe", hr);

        System.out.println(employee.getName() + " works in " + employee.getDepartment().getName());
    }
}
