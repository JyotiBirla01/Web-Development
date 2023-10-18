
// Q.10 create a class Toy having variable toyname ,price,and static variable "madein" .
// create no arg and parameterized constructor to initialize class variables .
// Define static function static display and non static method display
// --display() print class non static variable
// --static display print static variable
// create another class Electronic Toy which has fields like model no and Toy reference .
// create parameterized constructor to initialize both variables.
// In Electronic Class define print All function that print all values of same class as well as call
// toy class static and non static functions .
//package Constructor;
package OOps;

public class Toy {
    String toyName = null;
    int price = 0;
    static String madeIn = null;

    Toy() {

    }

    Toy(String toyName, int price, String madeIn) {
        this.toyName = toyName;
        this.price = price;
        this.madeIn = madeIn;

    }

    static void staticdisplay() {
        System.out.println("Made in :- " + madeIn);

    }

    void display1() {
        System.out.println("Toy Name  :-" + toyName);
        System.out.println("Price :-" + price);

    }
}
