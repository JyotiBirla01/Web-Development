import java.util.Scanner;

abstract class Shape {
    abstract float area();

    abstract float perimeter();

}

class Rectangle extends Shape {
    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public float area() {
        return length * width;

    }

    public float perimeter() {
        return (2 * (length + width));
    }
}

class Circle extends Shape {
    private int radius;
    private static float pi = 3.14f;

    public Circle(int radius) {

        this.radius = radius;
    }

    public float area() {
        return pi * radius * radius;

    }

    public float perimeter() {
        return (2 * pi * radius);
    }
}

class Triangle extends Shape {
    private int side;

    public Triangle(int side) {

        this.side = side;
    }

    public float area() {
        return side * side * side;

    }

    public float perimeter() {
        return (2 * side);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length ");
        int length = sc.nextInt();
        System.out.println("Enter the width ");
        int width = sc.nextInt();
        System.out.println("Enter the radius ");
        int radius = sc.nextInt();
        System.out.println("Enter the sides");
        int side = sc.nextInt();
        Rectangle obj = new Rectangle(length, width);
        System.out.println(" Area of rectangle is " + obj.area());
        System.out.println("Perimeter of rectangle is " + obj.perimeter());

        Circle obj1 = new Circle(radius);
        System.out.println(" Area of circle  is " + obj1.area());
        System.out.println("Perimeter of circle  is " + obj1.perimeter());

        Triangle obj2 = new Triangle(side);
        System.out.println(" Area of triangle  is " + obj2.area());
        System.out.println("Perimeter of triangle  is " + obj2.perimeter());

    }
}