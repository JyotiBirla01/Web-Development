// A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height. How many bricks will be used to make a wall 
//of length 15 m, breadth 10 m and height 8 metres?

public class Ass21 {
    public static void main(String[] args) {
        int length1 = 15, breadth1 = 8, height1 = 5, length2 = 15, breadth2 = 10, height2 = 8, volumeOfBrick,
                volumeOfWall;
        volumeOfBrick = length1 * breadth1 * height1;
        System.out.println("Volume of each  brick is " + volumeOfBrick + " cm");
        // 1m=100cm
        // length 15m = 150 cm
        // breadth 10m = 100cm
        // height = 8m = 800cm

        volumeOfWall = (length2 * 100) * (breadth2 * 100) * (height2 * 100);
        System.out.println("Volume of wall is " + volumeOfWall + "cm");
        float noOfBricks = volumeOfWall / volumeOfBrick;
        System.out.println(noOfBricks + " bricks will be used to make a wall ");

    }
}
