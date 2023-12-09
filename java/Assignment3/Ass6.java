//Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm
public class Ass6 {
    public static void main(String[] args) {
        int s1 = 10, s2 = 9, s3, perimeter = 36;
        s3 = perimeter - s1 - s2;
        System.out.println("Third side is " + s3);
        float s = (s1 + s2 + s3) / 2;
        System.out.println("The value of s is " + s);
        double total = (s * (s - s1) * (s - s2) * (s - s3));
        double area = (Math.sqrt(total));
        System.out.println("The area of trinagle is " + area);

    }

}
