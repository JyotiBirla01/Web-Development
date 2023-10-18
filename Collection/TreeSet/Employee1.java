//----------------------Comparator----------------------

import java.util.Comparator;
import java.util.TreeSet;

public class Employee1 {
    private int id;
    private String name;
    private String address;
    private long contact;

    public Employee1() {

    }

    public Employee1(int id, String name, String address, long contact) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getContact() {
        return contact;
    }

    public int compareTo(Employee1 e1) {
        return this.id;

    }

    public String toString() {
        return id + " " + name + " " + address + " " + contact;
    }

}

class SortById implements Comparator<Employee1> {

    public int compare(Employee1 e1, Employee1 e2) {
        return e1.getId() - e2.getId();
    }
}

class Main {
    public static void main(String[] args) {
        TreeSet<Employee1> ts = new TreeSet<Employee1>(new SortById());
        ts.add(new Employee1(4, "Jyoti", "Indore ", 9875463));
        ts.add(new Employee1(2, "Rani", "Bhopal ", 3454366));
        ts.add(new Employee1(3, "Pooja", "Goa ", 9876554));
        ts.add(new Employee1(3, "Raja", "Indore  ", 32414445));
        ts.add(new Employee1(1, "Ram", "Mumbai  ", 867856));
        for (Employee1 employee1 : ts) {
            System.out.println(employee1);
        }

    }
}
