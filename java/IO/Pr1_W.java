
//Que. 1 Write a java program to read/write data into the file.(Use File Output Stream, File Input
//Stream).
import java.io.File;
import java.io.FileWriter;

/*Que. 1 Write a java program to read/write data into the file.(Use File Output Stream, File Input
Stream).
 */
public class Pr1_W {
    public static void main(String[] args) {

        try {
            File f = new File("C:/Users/Jyoti Birla/Desktop/Pr.text");
            if (!f.exists())
                f.createNewFile();
            FileWriter fw = new FileWriter(f);
            String data = " Java is high level language ";
            fw.write(data);
            fw.close();
            System.out.println("Operation success ");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
