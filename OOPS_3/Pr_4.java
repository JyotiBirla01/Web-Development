import java.util.Scanner;

class Circle {
    private float radius;
    private static float pi = 3.14f;

    public Circle(float radius) {
        this.radius = radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public float area() {
        return pi * radius * radius;
    }

    public float circumference() {
        return 2 * pi * radius;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius ");
        float radius = sc.nextFloat();
        Circle obj = new Circle(radius);
        System.out.println("Area of circle is : " + obj.area());
        System.out.println("Circumference of circle is : " + obj.circumference());
        obj.setRadius(10);
        System.out.println("Area of circle is : " + obj.area());
        System.out.println("Circumference of circle is : " + obj.circumference());

    }
}
