
/*11) Create an Abstract class Processor with int member variable data and method showData to 
display data value.
Create abstract method process() to define processing of member data.
Create a class Factorial using abstract class 	Processor to calculate  and print 	factorial
 of a number by overriding the process method.
Create a class Circle using abstract class Processor to calculate and print area of a circle by
 overriding the process method Ask user to enter choice (factorial 	or circle area). Also ask
  data to work upon; Use Processor class reference to achieve this mechanism.
 */
import java.util.Scanner;

abstract class Processor {
    protected int data;

    public Processor(int data) {
        this.data = data;
    }

    public void showData() {
        System.out.println(data);
    }

    abstract void process();

}

class Factorial extends Processor {

    public Factorial(int data) {
        super(data);

    }

    public void process() {
        int fact = 1;
        while (data != 0) {
            fact = fact * data;
            data--;
        }
        System.out.println(" Factorial of number is " + fact);

    }

}

class Circle extends Processor {

    float area;
    float pi = 3.14f;

    public Circle(int data) {
        super(data);

    }

    public void process() {
        area = pi * data * data;
        System.out.println("Area of circle is " + area);
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data ");
        int data = sc.nextInt();
        System.out.println("Choose any one\n 1. Factorial \n 2. Area of circle ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Processor f = new Factorial(data);
                f.process();
                break;
            case 2:
                Processor c = new Circle(data);
                c.process();
                break;
        }
    }
}