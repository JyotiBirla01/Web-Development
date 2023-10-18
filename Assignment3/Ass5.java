public class Ass5 {
    public static void main(String[] args) {
        float cost = 1600, length = 20, rate = 25, breadth, area;
        float totalCost = cost / rate;
        System.out.println(totalCost);
        float perimeter = totalCost;
        System.out.println("Perimeter of the park is " + perimeter);

        breadth = (totalCost - length) / 2;
        System.out.println("Breadth of park is " + breadth);
        area = length * breadth;
        System.out.println("Area of the park is " + area);
    }

}
