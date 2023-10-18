
/*12) Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. 	Create abstract
 method calcTax().
Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly
 salary.Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on 
 unitprice of product.Create class for main method(Say XYZ), accept employee information and a 
 product information from user and print income tax and sales  */
import java.util.Scanner;

interface Taxable {
    double salesTax = 7 / 100.0;
    double incomeTax = 10.5 / 100;

    double calcTax();
}

class Employee implements Taxable {
    int empId;
    String name;
    double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public double calcTax() {
        double incomeTaxAmount = salary * incomeTax;
        return incomeTaxAmount;
    }

}

class Product implements Taxable {
    private int pid;
    private double price, quantity;

    public Product(int pid, double price, double quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public double calcTax() {
        double salesTaxAmount = price * quantity * salesTax;
        return salesTaxAmount;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee Id");
        int empId = sc.nextInt();
        System.out.println("Enter the employee name");
        String name = sc.next();
        System.out.println("Enter the salary ");
        double salary = sc.nextDouble();
        System.out.println("Enter the product Id");
        int pid = sc.nextInt();
        System.out.println("Enter the price of product ");
        double price = sc.nextDouble();
        System.out.println("Enter the quantity of product");
        double quantity = sc.nextDouble();
        Taxable emp = new Employee(empId, name, salary);
        Taxable pro = new Product(pid, price, quantity);
        System.out.println("Income tax for employee " + (emp.calcTax()));
        System.out.println("Sales Tax for product " + (pro.calcTax()));
    }
}