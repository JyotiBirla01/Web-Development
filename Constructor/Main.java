import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter toy name");
        String toy = sc.nextLine();
        System.out.println(" Enter price");
        int price = sc.nextInt();
        System.out.println("Enter model number ");
        int model = sc.nextInt();
        System.out.println("From where made ");
        String made = sc.nextLine();

        Toy.madeIn = made;
        Toy obj1 = new Toy(toy, price);
        obj1.display();
        Toy obj2 = new Toy(toy, price);
        obj2.display();

        ElectronicToy obj3 = new ElectronicToy(model, obj1);
        obj3.printAll();

    }
}
