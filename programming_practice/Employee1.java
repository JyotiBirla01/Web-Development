import java.util.Scanner;

public class Employee1 {
    private int yearOfJoining, salary;
    String name;
    String address;

    public Employee1(String name, int yearOfJoining, int salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;

    }

    public Employee1() {

    }

    public void display() {
        System.out.println("Name " + name);
        System.out.println("Year of joining " + yearOfJoining);
        System.out.println("salary " + salary);
        System.out.println("Address " + address);

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee e[] = new Employee[3];

        // System.out.println("Enter the name of employee");
        // String name = sc.nextLine();
        // System.out.println("Enter the year of joining ");
        // int yearOfJoining = sc.nextInt();
        // System.out.println("Enter the address ");
        // String address = sc.next();
        // System.out.println("Enter the salary");
        // int salary = sc.nextInt();
        Employee1 obj = new Employee1("Ashish", 1334, 2000, "64c Wallstreat");
        obj.display();
        Employee1 obj1 = new Employee1("Sam", 2000, 1000, "68D-WallsTreet");
        obj1.display();
        Employee1 obj2 = new Employee1("John", 1999, 3000, "26B-WallsTreet");
        obj2.display();

    }
} 