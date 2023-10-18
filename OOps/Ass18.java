
//Create class Product (pid, price, quantity) with parameterized constructor.Create a 
//  main function in different class (say XYZ) and perform following task:
// Accept five product information from user and store in an array
// Find Pid of product with highest price.
// Create method (with array of product’s object as argument) in XYZ class to calculate and 
// return total amount spent on all products.
//  (amount spent on single product=price of product * quantity of product).
// PID is unique number .
import java.util.Scanner;

class Product {
    private int pid, price, quantity;

    public Product(int pid, int price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;

    }

    public void amountSpent(int Product[]) {
        int totalAmount;
        System.out.println("Total amount spent on all products ");
        for (int i = 0; i < 5; i++) {
            totalAmount = price * quantity;
            System.out.println(totalAmount);
        }

    }

    int max = Integer.MIN_VALUE;

    public void pidOfProduct(int price[]) {
        for (int i = 0; i < price.length; i++) {
            if (price[i] > max) {
                max = price[i];

            }

        }
        System.out.println("Pid of product with higest prize" + max);

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p[] = new Product[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the PID for " + (i + 1) + " product");
            int pid = sc.nextInt();

            System.out.println("Enter the Prize for " + (i + 1) + " product");
            int prize = sc.nextInt();

            System.out.println("Enter the quantity for " + (i + 1) + " product");
            int quantity = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            p[i].display();
        }
    }
}