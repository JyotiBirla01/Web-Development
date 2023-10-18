public class Employee {
    private String name;
    private int id;
    static private String company = "Info";

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public void display() {
        System.out.println("Name :" + name + "\tId : " + id + "\tCompany : " + company);
    }

    public static void main(String[] args) {
        Employee obj = new Employee("Hari", 101);
        Employee obj1 = new Employee("Pari", 102);
        obj.display();
        ;
        obj1.display();
    }

}
