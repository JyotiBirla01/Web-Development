import java.util.Scanner;

class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius :- ");
        int r = sc.nextInt();
        System.out.println("Enter the height :- ");
        int h = sc.nextInt();
        float pi = 3.1415f;
        float volume = (pi * r * r * h);
        System.out.println("The volume  of cylinder is :- " + volume);

    }

}
