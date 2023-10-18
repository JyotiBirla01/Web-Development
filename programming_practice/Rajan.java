import java.util.Scanner;

public class Rajan {
    public void bill(int pizza, int puff, int coldDrink) {
        System.out.println("------------------------------------------------------------");
        System.out.println("                      Your Bill                        ");
        System.out.println("Product Name     Price       Quantity     Total");
        System.out.println("Pizza\t\t " + "100\t\t" + pizza + "\t\t" + (100 * pizza));
        System.out.println("Puffs\t\t " + "20\t\t" + puff + "\t\t" + (20 * puff));
        System.out.println("ColdDrink\t " + "10\t\t" + coldDrink + "\t\t" + (10 * puff));
        System.out.println("--------------------------------------------------------");
        System.out.println("Total Bill                " + ((100 * pizza) + (20 * puff) + (10 * puff)));
        System.out.println("----------------------------------------------------------------");
    }

}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of pizza");
        int pizza = sc.nextInt();
        System.out.println("Enter the quantity of puff");
        int puff = sc.nextInt();
        System.out.println("Enter the quantity of cold drink");
        int coldDrink = sc.nextInt();
        Rajan obj = new Rajan();
        obj.bill(pizza, puff, coldDrink);

    }

}
