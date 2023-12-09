
// Create a class Person with properties (name and age) with following features.
// Default age of person should be 18.
// A person object can be initialized with name and age.
// Method to display name and age of person.
import java.util.Scanner;

public class Person16 {
    private String name;
    private int age;

    public Person16() {
        age = 18;
    }

    public Person16(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String geName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name " + name);
        System.out.println("Age" + age);
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        Person16 obj1 = new Person16(name, age);
        Person16 obj2 = new Person16(name, age);
        Person16 obj3 = new Person16();

        obj1.display();
        obj1.display();
        obj1.setName("Rani");
        obj1.setAge(18);
        System.out.println(obj1.geName());
        System.out.println(obj1.getAge());
        System.out.println(obj2.geName());
        System.out.println(obj2.getAge());
        System.out.println(obj3.geName());
        System.out.println(obj3.getAge());

    }
}