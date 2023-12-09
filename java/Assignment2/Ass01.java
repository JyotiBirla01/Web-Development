import java.util.Scanner;

class Ass01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius");
        int radius = sc.nextInt();
        float pi = 3.14f;
        float areaOfCircle = pi * radius * radius;
        System.out.println(areaOfCircle);

    }

}
