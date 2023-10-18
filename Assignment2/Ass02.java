import java.util.Scanner;

class Ass02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int breadth = sc.nextInt();
        int areaOfRectangle = length * breadth;
        System.out.println("Area of rectangle is " + areaOfRectangle);

    }

}