//How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required for a wall 20 m long, 2 m high and 
//0.75 m thick? If bricks sell at $900 per thousand what will it cost to build the wall?

public class Ass24 {
    public static void main(String[] args) {
        float length1 = 25, breadth1 = 7.5f, height1 = 10, length2 = 2, breadth2 = 0.75f, height2 = 2, volumeOfBricks,
                volumeOfWall, totalBricks;
        volumeOfBricks = length1 * breadth1 * height1;
        System.out.println("Volume of bricks is " + volumeOfBricks);
        volumeOfWall = (length2 * 100) * (breadth2 * 100) * (height2 * 100);
        System.out.println("Volume of Wall is " + volumeOfWall);
        totalBricks = volumeOfWall / volumeOfBricks;
        System.out.println(totalBricks + " bricks will be required for a wall ");
        System.out.println(900 * totalBricks + "it is the cost to build the wall");

    }

}
