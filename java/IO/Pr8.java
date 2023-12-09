/*Que. 8 Write a program to read data from shopping.dat file creted in above problem and find
total money */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Pr8 {
    public static void main(String[] args) throws Exception {
        try {
            File f = new File("Pr7.txt");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Shopping obj = (Shopping) ois.readObject();
            System.out.println(
                    " Item name :" + obj.itemName + "  , Price : " + obj.price + " , Quantity :" + obj.quantity);

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
