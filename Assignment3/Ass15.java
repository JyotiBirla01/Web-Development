//Shelly has a rectangular garden of length 22 m and breath 15 m. Her friend Rachel has a square garden of side 21 m.
// Whose garden is bigger and by how much?

public class Ass15 {
    public static void main(String[] args) {
        int length1 = 22, breadth1 = 15, length2 = 21, breadth2 = 21;
        int area1 = length1 * breadth1;
        System.out.println("The area of rectangular garden is " + area1);
        int area2 = length2 * breadth2;
        System.out.println("The area of square garden is " + area2);
        int total = area2 - area1;
        System.out.println("Square garden is bigger than rectangular garden  by " + total + " m");
    }

}
