//Ron jogs around a rectangular park of length 50 m and breadth 30 m. If he takes 10 rounds of the park each day, 
//how much distance does he cover in a day in km?
public class Ass18 {
    public static void main(String[] args) {
        int length = 50, breadth = 30, perimeter, distance;
        perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangular park is " + perimeter);
        distance = 10 * perimeter;
        System.out.println("Distance cover in a day in  m is " + distance);
        float distanceInKm = distance / 1000;
        System.out.println("Distance cover in a day in  Km is " + distanceInKm);

    }

}
