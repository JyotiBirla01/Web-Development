
/*Que. 7 Write a program to store your shopping details in a binary file(shopping.dat) with
information itemName, price, quantity. (Use ObjectOutputStream to store Item class
object). */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Shopping  implements Serializable{
    String itemName;
    double price;
    double quantity;

    public Shopping(String itemName, double price, double quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double price() {
        return price;

    }

    public void price(double price) {
        this.price = price;
    }

    public double quantity() {
        return quantity;
    }

    public void quantity(double quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        try {
            File f = new File("Pr7.txt");
            if (!f.exists())
                f.createNewFile();
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Shopping s = new Shopping("Biscuites ", 1000, 10);
            oos.writeObject(s);
            System.out.println(" Operation success ");

        } catch (IOException e) {
            e.printStackTrace();
        }
      
    }
}