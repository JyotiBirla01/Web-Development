
// 20)Create class Tile to store the edge length of a square tile , and create
// another class
// Floor to store length and width of a rectangular floor. Add method
// totalTiles(Tile t) in
// Floor class with Tile as argument to calculate the whole number of tiles
// needed to cover the
// floor completely.
import java.util.Scanner;

class Tile {
    private int edge, area;

    public Tile(int edge) {
        this.edge = edge;
        this.area = edge * edge;

    }

    int getArea() {
        return area;
    }
}

class Floor {
    private int length, width;

    public Floor(int length, int width) {
        this.length = length;
        this.width = width;

    }

    public void totalTiles(Tile t) {
        int tileArea = t.getArea();
        int floorArea = length * width;
        int numberTiles = floorArea / tileArea;
        System.out.println("Number of tiles" + numberTiles);

    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the edgelength of square tile");
        int edgelength = sc.nextInt();
        System.out.println("Enter the length of rectangular floor");
        int length = sc.nextInt();
        System.out.println("Enter the width of rectangulat floor");
        int width = sc.nextInt();
        Tile obj = new Tile(edgelength);
        Floor obj2 = new Floor(length, width);
        obj2.totalTiles(obj);

    }

}
