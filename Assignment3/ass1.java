public class Ass1 {
    public static void main(String[] args) {
        // perimeter of rectangle is 230cm
        int perimeter = 230;
        // length of rectangle is 70 cm
        int length = 70;
        int breadth = (perimeter - length) / 2;
        System.out.println("Breadth of rectangle is :- " + breadth);
        int area = length * breadth;
        System.out.println("The area of rectangle is :- " + area);

    }

}
