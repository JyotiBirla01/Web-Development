//--------------------Comparable---------------------

import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
    private int eId;
    private String eName;
    private String department;
    private String address;

    public Employee(int eId, String eName, String department, String address) {
        this.eId = eId;
        this.eName = eName;
        this.department = department;
        this.address = address;
    }

    public int geteId() {
        return eId;
    }

    public String geteName() {
        return eName;
    }

    public String getDepartment() {
        return department;
    }

    public String getAddress() {
        return address;
    }

    public int compareTo(Employee e) {
        return this.eId - e.eId;
    }

    public String toString() {
        return eId + " " + eName + " " + department + " " + address;
    }

}

class Main {
    public static void main(String[] args) {
        TreeSet<Employee> ts = new TreeSet<Employee>();
        ts.add(new Employee(5, "Ankit", "CS", "Indore"));
        ts.add(new Employee(4, "Ajay", "Mechanical", "Bhopal"));
        ts.add(new Employee(3, "Ram", "Science ", "Mumbai"));
        ts.add(new Employee(2, "Tarun", "Commerce", "Delhi"));
        ts.add(new Employee(1, "Tata", "CS", "Goa"));
        ts.add(new Employee(1, "Queen", "Scinece", "Gujrat"));
        for (Employee employee : ts) {
            System.out.println(employee);
        }
    }
}