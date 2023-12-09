import java.util.Scanner;

public class VolumeOfSphere {
    private int radius;
    private float pi = 3.14f;

    public void volume(int radius) {
        float ans = 4 / 3 * (pi * radius * radius * radius);
        System.out.println(ans);

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius ");
        int radius = sc.nextInt();
        VolumeOfSphere obj = new VolumeOfSphere();
        obj.volume(radius);

    }
}