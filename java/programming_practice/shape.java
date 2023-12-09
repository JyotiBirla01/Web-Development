/*Write a base class shape and  derive the 2 classes as circle and rectangle implements the appropriate
 function in both classes */
interface I {
    float area();

}

class Circle implements I {
    static float pi = 3.14f;
    private int r = 5;

    public float area() {
        return pi * r * r;

    }

}

class Rectangle implements I {
    int length = 3;
    int breadth = 4;

    public float area() {
        return length * breadth;
    }

}

public class shape {
    public static void main(String[] args) {
        I obj = new Circle();
        System.out.println(obj.area());

        I obj1 = new Rectangle();
        System.out.println(obj1.area());

    }

}
