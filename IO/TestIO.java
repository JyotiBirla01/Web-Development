
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class TestOOS  {
    public static void main(String[] args) {
        try {
            File f = new File("abc.txt");

            if (!f.exists())
                f.createNewFile();

            FileOutputStream fos = new FileOutputStream(f);

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Customers customer = new Customers();
            customer(21,"vinay",21,96301);

            oos.writeObject(c);
            oos.close();

            System.out.println("Operation success...");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void customer(int i, String string, int j, int k) {
    }

}