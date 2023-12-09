// 5) Create class OneBHK with instance variable roomArea , hallArea and price.
// Create default and parameterized constructor.
// Method show(): to print OneBHK data member information.

import java.util.Scanner;

class OneBHK {
    private float roomArea, hallArea, price;

    public OneBHK() {

    }

    public OneBHK(float roomArea, float hallArea, float price) {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    public void show() {
        System.out.println("Room Area : " + roomArea);
        System.out.println("Hall Area : " + hallArea);
        System.out.println("Price :  " + price);
    }
}

class Main {
    public static void main(String[] args) {
        OneBHK obj = new OneBHK(200, 500, 50000);
        obj.show();

    }
}
