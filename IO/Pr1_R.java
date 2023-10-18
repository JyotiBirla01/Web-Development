import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class Pr1_R {
    public static void main(String[] args) {
        File f = new File("C:/Users/Jyoti Birla/Desktop/Pr.text");
        try {
           FileReader fr= new FileReader(f);
           int i;
           while((i=fr.read())!=-1)
           {
        System.out.print((char )i);
           }


            }

         catch (Exception e) {
            e.printStackTrace();
        }
    }
}
