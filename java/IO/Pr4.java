
/*e. 4 Write a program to count how many times character ‘t’ occurs in a file. */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Pr4 {
    public static void main(String[] args) {
        File f = new File("Pr_4.txt");
        try {
            // File f = new File("Pr_4.text");
            if (!f.exists())
                f.createNewFile();
            FileWriter fw = new FileWriter(f);
            String data = " Java is high level language and platform independent ";
            fw.write(data);

            fw.close();
            System.out.println("Operation success ");
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        try {

            FileReader r = new FileReader(f);

            int i, count = 0;
            while ((i = r.read()) != -1) {
                if (i == 't')
                    count++;
                // System.out.print((char) i);
            }

            System.out.println("The char 't ' occurs " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
