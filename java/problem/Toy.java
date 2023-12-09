
// Q.10 create a class Toy having variable toyname ,price,and static variable "madein" .
// create no arg and parameterized constructor to initialize class variables .
// Define static function static display and non static method display
// --display() print class non static variable
// --static display print static variable
// create another class Electronic Toy which has fields like model no and Toy reference .
// create parameterized constructor to initialize both variables.
// In Electronic Class define print All function that print all values of same class as well as call
// toy class static and non static functions .
package problem;

import java.util.Scanner;

public class Toy {
    String toyname;
    int price;
    static String madein;

    Toy() {

    }

    static void staticdisplay() {
        System.out.println(madein);

    }

    void display() {
        System.out.println(toyname);
        System.out.println(price);

    }

    Toy(int toyname, int price, int madein) {
        System.out.println(toyname);
        System.out.println(price);
        System.out.println(madein);

    }

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
}
