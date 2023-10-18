import java.util.Scanner;

class Ass2_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle :-");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of Rectangle :-");
        int breadth = sc.nextInt();
        if (length == breadth)
            System.out.println("Rectangle is Square");
        else
            System.out.println("Rectangle is not Square");

    }
}