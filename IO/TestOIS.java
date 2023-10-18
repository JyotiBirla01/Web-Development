
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

 class TestOIS {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("abc.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Customers obj = (Customers) ois.readObject();

            System.out.println(obj.getId() + "  " + obj.getName() + " " + obj.getId() + " " + obj.getMobile());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}