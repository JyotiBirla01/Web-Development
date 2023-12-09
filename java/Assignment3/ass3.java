public class Ass3 {
    public static void main(String[] args) {
        int lOT = 13, bOT = 7, lOR = 520, bOR = 140;
        int areaOT = lOT * bOT;
        System.out.println("The area  of 1 tile is " + areaOT);
        int areaOR = lOR * bOR;
        System.out.println("The area of rectangular region :-" + areaOR);
        float tiles = areaOR / areaOT;
        System.out.println("The number of tiles is " + tiles);

    }
}
