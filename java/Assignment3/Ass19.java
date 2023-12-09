//19. A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am are kept on a table. Which shape has
// more volume?

public class Ass19 {
    public static void main(String[] args) {
        int edge = 7, length = 7, breadth = 4, height = 8, volumeOfCube, volumeOfCuboid;
        volumeOfCube = edge * edge * edge;
        System.out.println("Volume of cube is " + volumeOfCube);
        volumeOfCuboid = length * breadth * height;
        System.out.println("Volume of cuboid is " + volumeOfCuboid);
        if (volumeOfCube > volumeOfCuboid)
            System.out.println("volume of cube has more volume ");
        else if (volumeOfCube > volumeOfCuboid)
            System.out.println("volume of cuboid  has more volume ");
        else
            System.out.println("Both cube annd cuboid has  same volume");
    }

}
