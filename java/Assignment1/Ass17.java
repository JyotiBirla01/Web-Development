import java.util.Scanner;

class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height in inches ");
        float h = sc.nextFloat();
        float cm = (2.54f * h);
        System.out.println("The height in cm is " + cm);

    }

}
