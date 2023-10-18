import java.util.Scanner;

class Rectangle {
    private float width, height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;

    }

    public float area() {
        return height * width;
    }

    public float perimeter() {
        return 2 * (width + height);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height ");
        float height = sc.nextFloat();
        System.out.println("Enter the width ");
        float width = sc.nextFloat();
        Rectangle obj = new Rectangle(height, width);
        System.out.println(" Area of rectangle is : " + obj.area());
        System.out.println(" Perimeter of rectabgle is :" + obj.perimeter());
    }
}