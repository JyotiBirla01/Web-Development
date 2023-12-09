import java.io.File;
import java.io.FileInputStream;

public class Pr1_R {
    public static void main(String[] args) {
        File f = new File("C:/Users/Jyoti Birla/Desktop/Pr.text");
        try {
            FileInputStream fin = new FileInputStream(f);
            String data = " ";
            while (true) {
                int x = fin.read();
                if (x == -1) {
                    break;
                    data = data + (char) x;

                }
                System.out.println(data);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
