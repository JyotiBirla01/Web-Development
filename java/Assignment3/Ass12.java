// Find the area of a right angled triangle whose hypotenuse is 13 cm and one of its sides containing the right angle
// is 12 cm. Find the length of the other side.
public class Ass12 {
    public static void main(String[] args) {
        int hypotenuse = 13, perpendicular = 12;
        double base = (hypotenuse * hypotenuse) - (perpendicular * perpendicular);
        double square = (Math.sqrt(base));
        System.out.println("The length of other side is " + square);

    }

}
