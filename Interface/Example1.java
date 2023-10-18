
interface Shape {
    void getArea();

}

class Circle implements Shape {
    double pi = 3.14, radius = 3, area;

    public void getArea() {
        area = pi * radius * radius;
        System.out.println(area);

    }

}

class Rectangle implements Shape {
    double length = 12, width = 10, area;

    public void getArea() {
        area = length * width;
        System.out.println(area);

    }
}

class Triangle implements Shape {
    double side = 10, area;

    public void getArea() {
        area = side * side * side;
        System.out.println(area);

    }
}

class Main {
    public static void main(String[] args) {
        Shape obj = new Circle();
        obj.getArea();
        Shape obj1 = new Rectangle();
        obj1.getArea();
        Shape obj2 = new Triangle();
        obj.getArea();
    }

}