
/*13) Create a class to calculate Area of circle with one data member to store the
 radius and another to store area value. Create method members
init - to input radius from user
calc - to calculate area
display- to display area*/
import java.util.Scanner;

public class AreaOfCircle {
    private float radius;
    private float pi = 3.14f;
    float area;

    public AreaOfCircle(float radius) {
        this.radius = radius;

    }

    public void calc() {
        area = pi * radius * radius;

    }

    public void display() {
        System.out.println("The area of circle is " + area);
    }

}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius ");
        float radius = sc.nextInt();
        AreaOfCircle obj = new AreaOfCircle(radius);
        obj.calc();
        obj.display();

    }
}