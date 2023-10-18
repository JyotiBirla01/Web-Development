//The length of one of the diagonals of a field in the form of a quadrilateral is 46 m. The perpendicular distance 
//of the other two vertices from the diagonal are 13 m and 10 m, find the area of the field.

public class Ass14 {
    public static void main(String[] args) {
        int diagonal = 46, h1 = 13, h2 = 10;
        float area = 1 / 2f * diagonal * (h1 + h2);
        System.out.println("The area of field is " + area);
    }

}
