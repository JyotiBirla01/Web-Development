package problem;

import java.util.Scanner;

class Electronic {
    int model;
    String toyref;

    Electronic(int model, String toyref) {
        System.out.println(model);
        System.out.println(toyref);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter toy name");
        String toy = sc.nextLine();
        System.out.println(" Enter price");
        int price = sc.nextInt();
        System.out.println("Enter model");
        String model = sc.nextLine();
        System.out.println("From where made ");
        String madein = sc.nextLine();

        // Electronic obj1 = new Electronic(toy, price, madein);
        Toy obj1 = new Toy();
        obj1.staticdisplay();
        obj1.display();

    }
}
