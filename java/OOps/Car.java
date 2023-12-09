import java.util.Scanner;

public class Car {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;

    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fuel");
        int fuel = sc.nextInt();
        Car obj = new Car(fuel);
        obj.setFuel(20);
        int result = obj.getFuel();
        System.out.println("The updated fuel is ");
        System.out.println(result);

    }
}