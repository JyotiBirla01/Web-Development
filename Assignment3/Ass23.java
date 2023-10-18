//Find the number of cubical boxes of cubical side 3 cm which can be accommodated in carton of 
//dimensions 15 cm × 9 cm × 12 cm.

public class Ass23 {
    public static void main(String[] args) {
        int side = 3, length = 15, breadth = 9, height = 12, volumeOfCube, volumeOfCuboid;
        volumeOfCube = side * side * side;
        System.out.println("volume of cubical box is " + volumeOfCube);
        volumeOfCuboid = length * breadth * height;
        System.out.println("Volume of carton is " + volumeOfCuboid);
        System.out.println("The number of cubical boxes " + volumeOfCuboid / volumeOfCube);

    }

}
