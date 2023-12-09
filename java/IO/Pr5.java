
/*Que. 5 Write a program to count no of words in a text file and average word size. */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Pr5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
            File f = new File("Pr5.txt");
            if (!f.exists())
                f.createNewFile();
            FileWriter fw = new FileWriter(f);
            System.out.println("Enter the data ");
            String data = sc.nextLine();
            fw.write(data);
            fw.close();
            System.out.println("Operation success ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            File f = new File("Pr5.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br= new BufferedReader(fr);
            String  line ;
            int  count = 0;

            while ((line  = br.readLine()) != null) {
               String words[]=line .split(" ");

                count+=words.length;
            }
            System.out.print("Total number of words is " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
