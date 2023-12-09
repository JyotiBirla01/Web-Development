
// 4) Create a class MathOperation with two data member X and Y to store the 
// operand and third data member R to store result of operation.Create method members
// init - to input X and Y from user
// add - to add X and Y and store in R
// multiply - to multiply X and Y and store in R
// power - to calculate X Y and store in R
// display- to display Result R
import java.util.Scanner;

class MathOperation14 {
    private int x, y, r;

    public MathOperation14(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void add() {
        r = x + y;
    }

    public void multiply() {
        r = x * y;

    }

    public void power() {
        r = 1;
        for (int i = 1; i < y; i++) {
            r = r * x;
        }

    }

    public void display() {
        System.out.println(r);
    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of y");
        int y = sc.nextInt();
        MathOperation14 obj = new MathOperation14(x, y);
        System.out.print("Addition :");
        obj.add();
        obj.display();
        System.out.print("Multiply :");
        obj.multiply();
        obj.display();
        System.out.print("Power :");
        obj.power();
        obj.display();

    }

}
