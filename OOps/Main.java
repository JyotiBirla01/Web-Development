package OOps;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter toy name");
        // String toy = sc.nextLine();
        // System.out.println(" Enter price");
        // int price = sc.nextInt();
        // System.out.println("Enter model number ");
        // int model = sc.nextInt();
        // System.out.println("From where made ");
        // String madeIn = sc.nextLine();
        // System.out.println("Toy Ref:- ");
        // String toy_ref = sc.nextLine();

        // Toy.madeIn = madeIn;
        Toy obj1 = new Toy("car", 600, "India");
        Toy.staticdisplay();
        obj1.display1();

        // Toy obj2 = new Toy(toy, price);
        // obj2.display();
        System.out.println("==========================================================");
        ElectronicToy obj3 = new ElectronicToy(78960, "carsmall");
        obj3.printAll();

    }
}
