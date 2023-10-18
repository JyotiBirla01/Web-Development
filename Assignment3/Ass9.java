//Find the area of an equilateral triangle, the length of whose sides is 12 cm.
//area of equilateral triangle is sqrt(3)/4*(side)^2
public class Ass9 {
    public static void main(String[] args) {
        int side = 12;
        double sqrt = Math.sqrt(3);
        double area = (sqrt / 4) * side * side;
        System.out.println(area);

    }

}
