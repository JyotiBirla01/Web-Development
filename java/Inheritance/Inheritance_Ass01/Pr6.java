// 5) Create class OneBHK with instance variable roomArea , hallArea and price.
// Create default and parameterized constructor.
// Method show(): to print OneBHK data member information.
// Create another class TwoBHK which has all the properties and behaviour of OneBHK and 
//a new instance variable room2Area.
// Create default and parameterized constructor.
// Method show(): to print all data member information.
// Write main function in another class(Say XYZ) and store three TwoBHK flat’s.
// and print information using show method. Also print total amount of all flats.

import java.util.Scanner;

// class OneBHK {
//     private float roomArea, hallArea;
//     private float price;

//     public OneBHK() {

//     }

//     public OneBHK(float roomArea, float hallArea, float price) {
//         this.roomArea = roomArea;
//         this.hallArea = hallArea;
//         this.price = price;
//     }

//     public void show() {
//         System.out.println("Room Area " + roomArea);
//         System.out.println("Hall Area " + hallArea);
//         System.out.println("Price " + price);

//     }
// }

class TwoBHK extends OneBHK {
    private float room2Area;
    static private float totalAmount;

    public TwoBHK(float roomArea, float room2Area, float hallArea, float price) {
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
        totalAmount += price;

    }

    public void show() {
        super.show();
        System.out.println("Room2 Area " + room2Area);

    }

    public static void totalPrice() {
        System.out.println("Total amount of flat " + totalAmount);
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoBHK obj[] = new TwoBHK[3];
        for (int i = 0; i < obj.length; i++) {
            System.out.println("Enter the room area");
            float roomArea = sc.nextFloat();
            System.out.println("Enter the room2 area");
            float room2Area = sc.nextFloat();
            System.out.println("Enter the hall area");
            float hallArea = sc.nextFloat();
            System.out.println("Enter the price ");
            float price = sc.nextFloat();
            obj[i] = new TwoBHK(roomArea, room2Area, hallArea, price);
        }
        System.out.println("------------------Two BHK-------------------------");

        for (int i = 0; i < obj.length; i++) {
            obj[i].show();
        }

        TwoBHK.totalPrice();

    }
}
